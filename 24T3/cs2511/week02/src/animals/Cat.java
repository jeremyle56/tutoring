package animals;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("meow");
        super.eat();
    }
}
