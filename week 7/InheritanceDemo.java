// This program demonstrates the basics of inheritance using the 'extends' keyword.
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}
