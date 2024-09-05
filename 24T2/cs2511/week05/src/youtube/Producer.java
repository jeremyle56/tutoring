package youtube;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String name;
    private List<User> subscribers = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    public void addSubscriber(User user) {
        subscribers.add(user);
    }

    public void postVideo(String name, double length) {
        Video video = new Video(name, length, this);
        videos.add(video);

        for (User subscriber : subscribers) {
            subscriber.signalNewVideo(video);
        }
    }
}
