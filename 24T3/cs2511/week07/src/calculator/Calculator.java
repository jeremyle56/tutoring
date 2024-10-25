package calculator;

public class Calculator {
    private Expression expression;

    public Calculator(Expression expression) {
        this.expression = expression;
    }

    public double evaluate() {
        return expression.evaluate();
    }
}
