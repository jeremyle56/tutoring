package calculator;

public class SubtractionExpression implements Expression {
    private Expression left;
    private Expression right;

    public SubtractionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
