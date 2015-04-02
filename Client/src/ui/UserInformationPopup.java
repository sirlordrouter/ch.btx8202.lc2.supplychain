package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Living Case 2<br>
 *
 *<p>This class provides the possibility to generate popup windows with a message and a title.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 05-01-2015
 */
public class UserInformationPopup extends Stage {

    private String message;
    private String title;

    public UserInformationPopup(String aMessage, String aTitle){
        this.message = aMessage;
        this.title = aTitle;
        setupPopup();
    }

    private void setupPopup(){
        // set the popup style so that it cant be hidden by the user
        this.initStyle(StageStyle.UTILITY);
        // initialize the close button, to close the popup window -> just an alternative to the default close button
        // on top of the window
        Button closeButton = new Button("Schliessen");
        closeButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent arg0) {
                closePopup();
            }

        });

        // setup the popup message
        Label messageLabel = new Label(this.message);
        messageLabel.setAlignment(Pos.BOTTOM_CENTER);
        messageLabel.setFont(Font.font("Calibri", FontWeight.BOLD, 14));
        messageLabel.setTextFill(Color.BLACK);

        // place button and messagelabel in a VBox to add it to the scene
        VBox vbox = new VBox();
        vbox.setPrefHeight(100);
        vbox.getChildren().addAll(messageLabel,closeButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10,10,10,10));
        vbox.setSpacing(20);

        Scene dialogScene = new Scene(vbox);
        this.setTitle(this.title);
        this.sizeToScene();
        this.setScene(dialogScene);
    }

    private void closePopup(){
        this.close();
    }

}
