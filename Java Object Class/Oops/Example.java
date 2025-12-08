// Java program for demonstrating the features and functionalities of OOP concepts in Java.    
class Animal {    
    private String name;    
    // Constructor    
    public Animal(String name) {    
        this.name = name;    
    }    
    // Encapsulation: Getter method    
    public String getName() {    
        return name;    
    }    
    // Polymorphism: Overridden method    
    public void makeSound() {    
        System.out.println("Some sound");    
    }    
}    
// Derived class (Inheritance)    
class Dog extends Animal {    
    // Constructor    
    public Dog(String name) {    
        super(name);    
    }    
    // Polymorphism: Overriding method    
    @Override    
    public void makeSound() {    
        System.out.println("Woof");    
    }    
}    
// Derived class (Inheritance)    
class Cat extends Animal {    
    // Constructor    
    public Cat(String name) {    
        super(name);    
    }    
    // Polymorphism: Overriding method    
    @Override    
    public void makeSound() {    
        System.out.println("Meow");    
    }    
}    
public class Example {    
    public static void main(String[] args) {    
        // Creating objects of the Dog and Cat classes    
        Dog dog = new Dog("Buddy");    
        Cat cat = new Cat("Whiskers");    
        // Accessing methods of the base class through objects of derived classes    
        System.out.println("Dog name: " + dog.getName());    
        dog.makeSound();    
        System.out.println("Cat name: " + cat.getName());    
        cat.makeSound();    
    }    
}    