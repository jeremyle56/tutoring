package youtube2;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribe(Producer producer) {
        producer.addSubscriber(this);
    }

    public void signalNewVideo(Video video) {
        System.out.println("New Video Posted by " + video.getProducer() + " - " + video.getName());
    }
}
