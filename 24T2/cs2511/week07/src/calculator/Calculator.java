package calculator;

/**
 * @author Nick Patrikeos
 **/
public class Calculator {
    private Expression expression;

    public Calculator(Expression expression) {
        this.expression = expression;
    }

    public double calculate() {
        return expression.compute();
    }
}
