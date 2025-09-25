package animal;

public class Animal {
    public void eat() {
        System.out.println("nom nom");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

        Cat myCat = new Cat();
        myCat.eat();
    }
}