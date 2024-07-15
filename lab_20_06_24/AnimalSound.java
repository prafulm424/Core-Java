package lab_20_06_24;
// Create an abstract class Animal and an abstract method makesound () and inherit Animal in Dog class and implement abstract method. 
//(Abstract class can contain non-abstract methods also)
abstract class Animal {
    // Abstract method (no implementation)
    public abstract void makeSound();

    // Non-abstract method
    public void sleep() {
        System.out.println("Zzz... Animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the overridden method in Dog
        myDog.sleep();     // Calls the inherited non-abstract method from Animal
    }
}
