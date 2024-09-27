package increment;

public class A {
    public static void main(String[] args) {
        B b1 = new B(); // x1 = 0, y = 0
        B b2 = new B(); // x2 = 0, y = 0 - 'y' is a static variable
        b1.incX(); // x1 = 1, y = 0
        b2.incY(); // x2 = 0, y = 1
        System.out.println(b1.getX() + " " + b1.getY()); // 1 1
        System.out.println(b2.getX() + " " + b2.getY()); // 0 1
    }
}
