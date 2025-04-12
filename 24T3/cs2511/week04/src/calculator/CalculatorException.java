package calculator;

public class CalculatorException extends RuntimeException {
    public CalculatorException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}