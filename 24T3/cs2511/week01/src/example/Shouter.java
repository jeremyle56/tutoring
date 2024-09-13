package example;

public class Shouter {
    private String message;

    public Shouter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("sup");
        s.shout();

        System.out.println(s.getMessage());
    }

}
