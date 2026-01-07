package example;

public class Shouter {
    private String message;

    // public Shouter() {}

    public Shouter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMe() {
        System.out.println(this);
    }

    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("this is a message");

        System.out.println(s.getMessage());
        s.setMessage("new message");
        System.out.println(s.getMessage());

        s.printMe();
        s.shout();
    }
}