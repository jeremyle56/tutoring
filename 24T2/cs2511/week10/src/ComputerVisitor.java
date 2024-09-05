
public class ComputerVisitor {
    private boolean isValid = false;

    public void visit(Keyboard keyboard) {
        System.out
                .println(
                        "Looking at mechanical keyboard " + keyboard + " which has " + keyboard.getNumKeys() + " keys");
    }

    public void visit(Mouse mouse) {
        System.out.println("Looking at mouse " + mouse);
    }

    public void visit(Computer computer) {
        System.out.println("Looking at computer " + computer + " with memory " + computer.getMemory());
    }

    public void validate() {
        isValid = true;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public static void main(String[] args) {
        ComputerComponent computer = new Computer("Corelli", 500);
        ComputerComponent keyboard = new Keyboard("Mechanical keyboard");
        ComputerComponent mouse = new Mouse("Bluetooth mouse");
        ComputerVisitor visitor = new ComputerVisitor();

        computer.accept(visitor);
        visitor.validate();

        computer.accept(visitor);
        keyboard.accept(visitor);
        mouse.accept(visitor);
    }

}