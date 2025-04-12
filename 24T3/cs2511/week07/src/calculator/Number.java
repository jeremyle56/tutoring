package calculator;

public class Number implements Expression {
    private double number;

    public Number(double number) {
        this.number = number;
    }

    public double evaluate() {
        return number;
    }
}
