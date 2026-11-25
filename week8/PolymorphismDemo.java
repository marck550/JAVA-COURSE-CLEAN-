class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal[] myAnimals = new Animal[3];
        myAnimals[0] = new Dog();
        myAnimals[1] = new Cat();
        myAnimals[2] = new Cow();

        System.out.println("=== ANIMAL SOUNDS ===");
        for (int i = 0; i < myAnimals.length; i++) {
            myAnimals[i].makeSound();
        }
    }
}
