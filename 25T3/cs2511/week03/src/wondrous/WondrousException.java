package wondrous;

// Unchecked exception: Subclass of RuntimeException
// Checked exception: Subclass of Exception
public class WondrousException extends RuntimeException {
    public WondrousException(String message) {
        super(message);
    }
}
