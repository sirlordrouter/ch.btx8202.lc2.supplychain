package service;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: WebService
 * Package: service
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 20.04.15
 */
public class MediPrepResult {
    private boolean result;
    /**
     * -1: Unbekannt
     * 0:
     * 1:
     * 2: DateTime Parse Exception
     * 3: No Data found to update
     * 4: Item Content is 0
     * 547: Integrity Contraint error => Product does not match stock item
     */
    private int errorCode;

    /**
     * Constructor
     * @param errorCode a code identifying the type of error
     * @param result A Boolean to mark the state
     */
    public MediPrepResult(boolean result, int errorCode){
        this.result = result;
        this.errorCode = errorCode;
    }

    public MediPrepResult(){

    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
