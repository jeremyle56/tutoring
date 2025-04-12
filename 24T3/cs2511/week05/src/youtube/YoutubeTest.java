package youtube;

public class YoutubeTest {
    public static void main(String[] args) {
        Producer u1 = new Producer("Shubh");
        User u2 = new User("Daniel");
        User u3 = new User("James");

        u2.subscribeTo(u1);
        u3.subscribeTo(u1);

        u1.postVideo("The Observer Pattern", 20);

    }
}
