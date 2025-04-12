package animals;

/*
 * Static type -->
 *      What we declare the variable to be (LHS of declaration)
 *      Lets us do type checking. Making sure the methods exists
 *      on the class, or that it matches the type of the function call
 * Dynamic type -->
 *      What the type of it underlying in memory?
 */

public class A {
    public static void main(String[] args) {
        C c = new C();  // static = C, dynamic = C
        c.speak();      // "quack"
        B b = c;        // static = B, dynamic = C
        b.speak();      // "quack"
        b = new B();    // static = B, dynamic = B
        b.speak();      // "moo"
        c.speak();      // "quack"
    }
}
