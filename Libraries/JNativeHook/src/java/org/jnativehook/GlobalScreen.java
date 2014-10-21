/* JNativeHook: Global keyboard and mouse hooking for Java.
 * Copyright (C) 2006-2014 Alexander Barker.  All Rights Received.
 * https://github.com/kwhat/jnativehook/
 * 
 * JNativeHook is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JNativeHook is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jnativehook;

// Imports.

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;
import org.jnativehook.mouse.NativeMouseMotionListener;
import org.jnativehook.mouse.NativeMouseWheelEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;

import javax.swing.event.EventListenerList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.URL;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.EventListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.jar.Attributes;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import java.util.logging.Logger;

/**
 * GlobalScreen is used to represent the native screen area that Java does not
 * usually have access to. This class can be thought of as the source component
 * for native input events.
 * <p>
 * This class also handles the loading, unpacking and communication with the
 * native library. That includes registering and un-registering the native hook
 * with the underlying operating system and adding global keyboard and mouse
 * listeners.
 *
 * @author Alexander Barker (<a href="mailto:alex@1stleg.com">alex@1stleg.com</a>)
 * @since	1.0
 * @version 1.2
 */
public class GlobalScreen {
	/**
	 * The GlobalScreen singleton.
	 */
	private static final GlobalScreen instance = new GlobalScreen();

	/**
	 * The list of event listeners to notify.
	 */
	private static final EventListenerList eventListeners = new EventListenerList();

	/**
	 * The service to dispatch events.
	 */
	private static ExecutorService eventExecutor;

	/**
	 * Private constructor to prevent multiple instances of the global screen.
	 * The {@link #registerNativeHook} method will be called on construction to
	 * unpack and load the native library.
	 */
	private GlobalScreen() {
		// Unpack and Load the native library.
		GlobalScreen.loadNativeLibrary();

		GlobalScreen.eventExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() {
			public Thread newThread(Runnable r) {
				Thread t = new Thread(r);
				t.setName("JNativeHook Native Dispatch");
				t.setDaemon(true);

				return t;
			}
		});
	}

	/**
	 * A destructor that will perform native cleanup by calling the
	 * {@link #unregisterNativeHook} method.  This method will not run until the
	 * class is garbage collected.
	 *
	 * @throws Throwable a <code>NativeHookException</code> raised by calling
	 *                   {@link #unloadNativeLibrary()}
	 * @see Object#finalize
	 */
	@Override
	protected void finalize() throws Throwable {
		if (GlobalScreen.isNativeHookRegistered()) {
			GlobalScreen.unloadNativeLibrary();
		}

		// Shutdown the current Event executor.
		eventExecutor.shutdownNow();
		eventExecutor = null;

		super.finalize();
	}

	/**
	 * Returns the singleton instance of <code>GlobalScreen</code>.
	 *
	 * @return singleton instance of <code>GlobalScreen</code>
	 */
	public static synchronized GlobalScreen getInstance() {
		return GlobalScreen.instance;
	}

	/**
	 * Adds the specified native key listener to receive key events from the
	 * native system. If listener is null, no exception is thrown and no action
	 * is performed.
	 *
	 * @param listener a native key listener object
	 */
	public void addNativeKeyListener(NativeKeyListener listener) {
		if (listener != null) {
			eventListeners.add(NativeKeyListener.class, listener);
		}
	}

	/**
	 * Removes the specified native key listener so that it no longer receives
	 * key events from the native system. This method performs no function if
	 * the listener specified by the argument was not previously added.  If
	 * listener is null, no exception is thrown and no action is performed.
	 *
	 * @param listener a native key listener object
	 */
	public void removeNativeKeyListener(NativeKeyListener listener) {
		if (listener != null) {
			eventListeners.remove(NativeKeyListener.class, listener);
		}
	}

	/**
	 * Adds the specified native mouse listener to receive mouse events from the
	 * native system. If listener is null, no exception is thrown and no action
	 * is performed.
	 *
	 * @param listener a native mouse listener object
	 */
	public void addNativeMouseListener(NativeMouseListener listener) {
		if (listener != null) {
			eventListeners.add(NativeMouseListener.class, listener);
		}
	}

	/**
	 * Removes the specified native mouse listener so that it no longer receives
	 * mouse events from the native system. This method performs no function if
	 * the listener specified by the argument was not previously added.  If
	 * listener is null, no exception is thrown and no action is performed.
	 *
	 * @param listener a native mouse listener object
	 */
	public void removeNativeMouseListener(NativeMouseListener listener) {
		if (listener != null) {
			eventListeners.remove(NativeMouseListener.class, listener);
		}
	}

	/**
	 * Adds the specified native mouse motion listener to receive mouse motion
	 * events from the native system. If listener is null, no exception is
	 * thrown and no action is performed.
	 *
	 * @param listener a native mouse motion listener object
	 */
	public void addNativeMouseMotionListener(NativeMouseMotionListener listener) {
		if (listener != null) {
			eventListeners.add(NativeMouseMotionListener.class, listener);
		}
	}

	/**
	 * Removes the specified native mouse motion listener so that it no longer
	 * receives mouse motion events from the native system. This method performs
	 * no function if the listener specified by the argument was not previously
	 * added.  If listener is null, no exception is thrown and no action is
	 * performed.
	 *
	 * @param listener a native mouse motion listener object
	 */
	public void removeNativeMouseMotionListener(NativeMouseMotionListener listener) {
		if (listener != null) {
			eventListeners.remove(NativeMouseMotionListener.class, listener);
		}
	}

	/**
	 * Adds the specified native mouse wheel listener to receive mouse wheel
	 * events from the native system. If listener is null, no exception is
	 * thrown and no action is performed.
	 *
	 * @param listener a native mouse wheel listener object
	 * @since 1.1
	 */
	public void addNativeMouseWheelListener(NativeMouseWheelListener listener) {
		if (listener != null) {
			eventListeners.add(NativeMouseWheelListener.class, listener);
		}
	}

	/**
	 * Removes the specified native mouse wheel listener so that it no longer
	 * receives mouse wheel events from the native system. This method performs
	 * no function if the listener specified by the argument was not previously
	 * added.  If listener is null, no exception is thrown and no action is
	 * performed.
	 *
	 * @param listener a native mouse wheel listener object
	 * @since 1.1
	 */
	public void removeNativeMouseWheelListener(NativeMouseWheelListener listener) {
		if (listener != null) {
			eventListeners.remove(NativeMouseWheelListener.class, listener);
		}
	}

	/**
	 * Enable the native hook if it is not currently running. If it is running,
	 * the function has no effect.
	 * <p>
	 * <b>Note:</b> This method will throw a <code>NativeHookException</code>
	 * if specific operating system features are unavailable or disabled.
	 * For example: Access for assistive devices is unchecked in the Universal
	 * Access section of the System Preferences on Apple's OS X platform or
	 * <code>Load "record"</code> is missing for the xorg.conf file on
	 * Unix/Linux/Solaris platforms.
	 *
	 * @throws NativeHookException problem registering the native hook with
	 *                             the underlying operating system.
	 * @since 1.1
	 */
	public static native void registerNativeHook() throws NativeHookException;

	/**
	 * Disable the native hook if it is currently registered. If the native
	 * hook it is not registered the function has no effect.
	 *
	 * @since 1.1
	 */
	public static native void unregisterNativeHook();

	/**
	 * Returns <code>true</code> if the native hook is currently registered.
	 *
	 * @return true if the native hook is currently registered.
	 * @since 1.1
	 */
	public static native boolean isNativeHookRegistered();

	/**
	 * Add a <code>NativeInputEvent</code> to the operating system's event queue.
	 * Each type of <code>NativeInputEvent</code> is processed according to its
	 * event id.
	 * <p>
	 *
	 * For both <code>NATIVE_KEY_PRESSED</code> and
	 * <code>NATIVE_KEY_RELEASED</code> events, the virtual keycode and modifier
	 * mask are used in the creation of the native event.  Please note that some
	 * platforms may generate <code>NATIVE_KEY_PRESSED</code> and
	 * <code>NATIVE_KEY_RELEASED</code> events for each required modifier.
	 * <code>NATIVE_KEY_TYPED</code> events will first translate the associated
	 * keyChar to its respective virtual code and then produce a
	 * <code>NATIVE_KEY_PRESSED</code> followed by a <code>NATIVE_KEY_RELEASED</code>
	 * event using that virtual code.  If the JNativeHook is unable to translate
	 * the keyChar to its respective virtual code, the event is ignored.
	 * <p>
	 *
	 * <code>NativeMouseEvents</code> are processed in much the same way as the
	 * <code>NativeKeyEvents</code>.  Both <code>NATIVE_MOUSE_PRESSED</code> and
	 * <code>NATIVE_MOUSE_RELEASED</code> produce events corresponding to the
	 * event's button code.  Keyboard modifiers may be used in conjunction with
	 * button press and release events, however, they might produce events for each
	 * modifier.  <code>NATIVE_MOUSE_CLICKED</code> events produce a
	 * <code>NATIVE_MOUSE_PRESSED</code> event followed by a
	 * <code>NATIVE_MOUSE_RELEASED</code> for the assigned event button.
	 * <p>
	 *
	 * <code>NATIVE_MOUSE_DRAGGED</code> and <code>NATIVE_MOUSE_MOVED</code> events
	 * are handled identically.  In order to produce a <code>NATIVE_MOUSE_DRAGGED</code>
	 * event, you must specify a button modifier mask that contains at least one
	 * button modifier and assign it to the event.  Failure to do so will produce a
	 * <code>NATIVE_MOUSE_MOVED</code> event even if the event id was set to
	 * <code>NATIVE_MOUSE_DRAGGED</code>.
	 * <p>
	 *
	 * <code>NATIVE_MOUSE_WHEEL</code> events are identical to
	 * <code>NATIVE_MOUSE_PRESSED</code> events.  Wheel events will only produce
	 * pressed events and will never produce <code>NATIVE_MOUSE_RELEASED</code>,
	 * <code>NATIVE_MOUSE_DRAGGED</code> or <code>NATIVE_MOUSE_MOVED</code>
	 *
	 * @param e the <code>NativeInputEvent</code> sent to the native system.
	 * @since 1.2
	 */
	public static native void postNativeEvent(NativeInputEvent e);

	/**
	 * Dispatches an event to the appropriate processor.  This method is
	 * generally called by the native library but may be used to synthesize
	 * native events from Java without replaying them on the native system.  If
	 * you would like to send events to other applications, please use
	 * {@link #postNativeEvent},
	 * <p>
	 *
	 * <b>Note:</b> This method executes on the native system's event queue.
	 * It is imperative that all processing be off-loaded to other threads.
	 * Failure to do so might result in the delay of user input and the automatic
	 * removal of the native hook.
	 *
	 * @param e the <code>NativeInputEvent</code> sent to the registered event listeners.
	 */
	public final void dispatchEvent(NativeInputEvent e) {
		if (eventExecutor != null) {
			if (e instanceof NativeKeyEvent) {
				processKeyEvent((NativeKeyEvent) e);
			}
			else if (e instanceof NativeMouseWheelEvent) {
				processMouseWheelEvent((NativeMouseWheelEvent) e);
			}
			else if (e instanceof NativeMouseEvent) {
				processMouseEvent((NativeMouseEvent) e);
			}
		}
	}

	/**
	 * Processes native key events by dispatching them to all registered
	 * <code>NativeKeyListener</code> objects.
	 *
	 * @param e the <code>NativeKeyEvent</code> to dispatch.
	 * @see NativeKeyEvent
	 * @see NativeKeyListener
	 * @see #addNativeKeyListener(NativeKeyListener)
	 */
	private void processKeyEvent(NativeKeyEvent e) {
		// The event cannot be modified beyond this point!  This is both a
		// Java restriction and a native code restriction.
		// FIXME The event should not be final for event consumption.  It still works but probably shouldn't.
		final NativeKeyEvent event = e;
		eventExecutor.execute(new Runnable() {
			public void run() {
				int id = event.getID();
				EventListener[] listeners = eventListeners.getListeners(NativeKeyListener.class);

				for (int i = 0; i < listeners.length; i++) {
					switch (id) {
						case NativeKeyEvent.NATIVE_KEY_PRESSED:
							((NativeKeyListener) listeners[i]).nativeKeyPressed(event);
							break;

						case NativeKeyEvent.NATIVE_KEY_TYPED:
							((NativeKeyListener) listeners[i]).nativeKeyTyped(event);
							break;

						case NativeKeyEvent.NATIVE_KEY_RELEASED:
							((NativeKeyListener) listeners[i]).nativeKeyReleased(event);
							break;
					}
				}
			}
		});
	}

	/**
	 * Processes native mouse events by dispatching them to all registered
	 * <code>NativeMouseListener</code> objects.
	 *
	 * @param e the <code>NativeMouseEvent</code> to dispatch.
	 * @see NativeMouseEvent
	 * @see NativeMouseListener
	 * @see #addNativeMouseListener(NativeMouseListener)
	 */
	private void processMouseEvent(NativeMouseEvent e) {
		// The event cannot be modified beyond this point!  This is both a 
		// Java restriction and a native code restriction.
		final NativeMouseEvent event = e;
		eventExecutor.execute(new Runnable() {
			public void run() {
				int id = event.getID();

				EventListener[] listeners;
				if (id == NativeMouseEvent.NATIVE_MOUSE_MOVED || id == NativeMouseEvent.NATIVE_MOUSE_DRAGGED) {
					listeners = eventListeners.getListeners(NativeMouseMotionListener.class);
				}
				else {
					listeners = eventListeners.getListeners(NativeMouseListener.class);
				}

				for (int i = 0; i < listeners.length; i++) {
					switch (id) {
						case NativeMouseEvent.NATIVE_MOUSE_CLICKED:
							((NativeMouseListener) listeners[i]).nativeMouseClicked(event);
							break;

						case NativeMouseEvent.NATIVE_MOUSE_PRESSED:
							((NativeMouseListener) listeners[i]).nativeMousePressed(event);
							break;

						case NativeMouseEvent.NATIVE_MOUSE_RELEASED:
							((NativeMouseListener) listeners[i]).nativeMouseReleased(event);
							break;

						case NativeMouseEvent.NATIVE_MOUSE_MOVED:
							((NativeMouseMotionListener) listeners[i]).nativeMouseMoved(event);
							break;

						case NativeMouseEvent.NATIVE_MOUSE_DRAGGED:
							((NativeMouseMotionListener) listeners[i]).nativeMouseDragged(event);
							break;
					}
				}
			}
		});
	}

	/**
	 * Processes native mouse wheel events by dispatching them to all registered
	 * <code>NativeMouseWheelListener</code> objects.
	 *
	 * @param e The <code>NativeMouseWheelEvent</code> to dispatch.
	 * @see NativeMouseWheelEvent
	 * @see NativeMouseWheelListener
	 * @see #addNativeMouseWheelListener(NativeMouseWheelListener)
	 * @since 1.1
	 */
	private void processMouseWheelEvent(NativeMouseWheelEvent e) {
		// The event cannot be modified beyond this point!  This is both a 
		// Java restriction and a native code restriction.
		final NativeMouseWheelEvent event = e;
		eventExecutor.execute(new Runnable() {
			public void run() {
				EventListener[] listeners = eventListeners.getListeners(NativeMouseWheelListener.class);

				for (int i = 0; i < listeners.length; i++) {
					((NativeMouseWheelListener) listeners[i]).nativeMouseWheelMoved(event);
				}
			}
		});
	}

	/**
	 * Set a different executor service for native event delivery.  By default,
	 * JNativeHook utilizes a single thread executor to dispatch events from
	 * the native event queue.  You may choose to use an alternative approach
	 * for event delivery by implementing an <code>ExecutorService</code>.
	 * <p>
	 * <b>Note:</b> Using null as an <code>ExecutorService</code> will cause all
	 * delivered events to be discarded until a valid <code>ExecutorService</code>
	 * is set.
	 *
	 * @param dispatcher The <code>ExecutorService</code> used to dispatch native events.
	 * @see java.util.concurrent.ExecutorService
	 * @see java.util.concurrent.Executors#newSingleThreadExecutor()
	 * @since 1.2
	 */
	public final void setEventDispatcher(ExecutorService dispatcher) {
		if (GlobalScreen.eventExecutor != null) {
			GlobalScreen.eventExecutor.shutdown();
		}

		GlobalScreen.eventExecutor = dispatcher;
	}

	/**
	 * Perform procedures to interface with the native library. These procedures
	 * include unpacking and loading the library into the Java Virtual Machine.
	 */
	private static void loadNativeLibrary() {
		String libName = System.getProperty("jnativehook.lib.name", "JNativeHook");

		try {
			// Try to load the native library assuming the java.library.path was
			// set correctly at launch.
			System.loadLibrary(libName);
		}
		catch (UnsatisfiedLinkError linkError) {
			// Get the package name for the GlobalScreen.
			String basePackage = GlobalScreen.class.getPackage().getName().replace('.', '/');

			// Compile the resource path for the
			StringBuilder libResourcePath = new StringBuilder("/");
			libResourcePath.append(basePackage).append("/lib/");
			libResourcePath.append(NativeSystem.getFamily()).append('/');
			libResourcePath.append(NativeSystem.getArchitecture()).append('/');


			// Get what the system "thinks" the library name should be.
			String libNativeName = System.mapLibraryName(libName);
			// Hack for OS X JRE 1.6 and earlier.
			libNativeName = libNativeName.replaceAll("\\.jnilib$", "\\.dylib");

			// Slice up the library name.
			int i = libNativeName.lastIndexOf('.');
			String libNativePrefix = libNativeName.substring(0, i) + '-';
			String libNativeSuffix = libNativeName.substring(i);
			String libNativeVersion = null;

			// This may return null in some circumstances.
			InputStream libInputStream = GlobalScreen.class.getResourceAsStream(libResourcePath.toString().toLowerCase() + libNativeName);
			if (libInputStream != null) {
				try {
					// Try and load the Jar manifest as a resource stream.
					URL jarFile = GlobalScreen.class.getProtectionDomain().getCodeSource().getLocation();
					JarInputStream jarInputStream = new JarInputStream(jarFile.openStream());

					// Try and extract a version string from the Manifest.
					Manifest manifest = jarInputStream.getManifest();
					if (manifest != null) {
						Attributes attributes = manifest.getAttributes(basePackage);

						if (attributes != null) {
							String version = attributes.getValue("Specification-Version");
							String revision = attributes.getValue("Implementation-Version");

							libNativeVersion = version + '.' + revision;
						}
						else {
							Logger.getLogger(GlobalScreen.class.getPackage().getName()).warning("Invalid library manifest!\n");
						}
					}
					else {
						Logger.getLogger(GlobalScreen.class.getPackage().getName()).warning("Cannot find library manifest!\n");
					}
				}
				catch (IOException e) {
					Logger.getLogger(GlobalScreen.class.getPackage().getName()).severe(e.getMessage());
				}


				try {
					// The temp file for this instance of the library.
					File libFile;

					// If we were unable to extract a library version from the manifest.
					if (libNativeVersion != null) {
						libFile = new File(System.getProperty("java.io.tmpdir"), libNativePrefix + libNativeVersion + libNativeSuffix);
					}
					else {
						libFile = File.createTempFile(libNativePrefix, libNativeSuffix);
					}

					byte[] buffer = new byte[4 * 1024];
					int size;

					// Check and see if a copy of the native lib already exists.
					FileOutputStream libOutputStream = new FileOutputStream(libFile);

					// Setup a digest...
					MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
					DigestInputStream digestInputStream = new DigestInputStream(libInputStream, sha1);

					// Read from the digest stream and write to the file steam.
					while ((size = digestInputStream.read(buffer)) != -1) {
						libOutputStream.write(buffer, 0, size);
					}

					// Close all the streams.
					digestInputStream.close();
					libInputStream.close();
					libOutputStream.close();

					// Convert the digest from byte[] to hex string.
					String sha1Sum = new BigInteger(1, sha1.digest()).toString(16).toUpperCase();
					if (libNativeVersion == null) {
						// Use the sha1 sum as a version finger print.
						libNativeVersion = sha1Sum;

						// Better late than never.
						File newFile = new File(System.getProperty("java.io.tmpdir"), libNativePrefix + libNativeVersion + libNativeSuffix);
						if (libFile.renameTo(newFile)) {
							libFile = newFile;
						}
					}

					// Set the library version property.
					System.setProperty("jnativehook.lib.version", libNativeVersion);

					// Load the native library.
					System.load(libFile.getPath());

					Logger.getLogger(GlobalScreen.class.getPackage().getName())
							.info("Library extracted successfully: " + libFile.getPath() + " (0x" + sha1Sum + ").\n");
				}
				catch (IOException e) {
					throw new RuntimeException(e.getMessage(), e);
				}
				catch (NoSuchAlgorithmException e) {
					throw new RuntimeException(e.getMessage(), e);
				}
			}
			else {
				Logger.getLogger(GlobalScreen.class.getPackage().getName())
						.severe("Unable to extract the native library " + libResourcePath.toString().toLowerCase() + libNativeName + "!\n");

				throw new UnsatisfiedLinkError();
			}
		}
	}

	/**
	 * Perform procedures to cleanup the native library. This method is called
	 * on garbage collection to ensure proper native cleanup.
	 */
	private static void unloadNativeLibrary() throws NativeHookException {
		// Make sure the native thread has stopped.
		GlobalScreen.unregisterNativeHook();
	}
}
