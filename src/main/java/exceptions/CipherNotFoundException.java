package exceptions;

public class CipherNotFoundException extends RuntimeException {
private static final String MESSAGE= "Type of Cipher is not recognized";

    public CipherNotFoundException(String type) {
        super(MESSAGE + type);
    }
}
