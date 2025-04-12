package calculator;

public class DivisionExpression implements Expression {
    private Expression left;
    private Expression right;

    public DivisionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
