package youtube;

public class Video {
    private String name;
    private double length;
    private Producer producer;

    public Video(String name, double length, Producer producer) {
        this.name = name;
        this.length = length;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
