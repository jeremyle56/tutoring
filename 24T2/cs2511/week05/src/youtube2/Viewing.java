package youtube2;

import youtube2.state.ReadyState;
import youtube2.state.ViewingState;

public class Viewing {
    private Video video;
    private Video nextVideo;
    private User user;
    private ViewingState state = new ReadyState(this);
    private boolean playing = false;

    public Viewing(Video video, Video nextVideo, User user) {
        this.video = video;
        this.nextVideo = nextVideo;
        this.user = user;
    }

    public void setPlaying(boolean play) {
        this.playing = play;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void changeState(ViewingState newState) {
        this.state = newState;
    }

    public String startPlayback() {
        return "Playing video " + video.getName() + "!!!";
    }

    public String getNextVideo() {
        return nextVideo.getName();
    }

    public String lock() {
        return state.onLock();
    }

    public String play() {
        return state.onPlay();
    }

    public String next() {
        this.video = nextVideo;
        return state.onNext();
    }
}