package calculator;

public class MultiplicationExpression implements Expression {
    private Expression left;
    private Expression right;

    public MultiplicationExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
