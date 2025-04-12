package shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    public Rectangle(String color) {
        super(color);
        System.out.println("Inside Rectangle constructor with one argument");
    }

    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("red", 10, 20);
        r.setHeight(7);

        Rectangle a = new Rectangle("red", 10, 25);

        System.out.println(r.getHeight());
        r.setHeight(15);
        System.out.println(a.getHeight());
    }

}
