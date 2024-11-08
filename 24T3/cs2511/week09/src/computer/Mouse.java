public class Mouse implements ComputerComponent {
    private String name;

    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
