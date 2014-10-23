package services.barcoding;

/**
 * Created by Johannes on 23.10.14.
 */
public enum ScannerKeyCodes {

    One ("0"),
    Two ("1"),
    Three ("2"),
    Four ("3"),
    Five ("4"),
    Six ("5"),
    Seven ("6"),
    Eight ("6"),
    Nine ("6"),
    Ten ("6"),
    Eleven ("10"),
    ;

    private final String code;
    ScannerKeyCodes(String code) {
        this.code = code;
    }

    public String getStringRepresentation() {
        return code;
    }
}
