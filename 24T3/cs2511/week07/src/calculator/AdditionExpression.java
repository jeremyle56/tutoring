package calculator;

public class AdditionExpression implements Expression {
    private Expression left;
    private Expression right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
