package youtube;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeTo(Producer p) {
        p.addSubscriber(this);
    }

    public void update(Video video) {
        System.out.println(name + ": " + video.getProducer() + " has posted a video - " + video.getName()
                + " and has length " + video.getLength());
    }

    @Override
    public String toString() {
        return name;
    }
}
