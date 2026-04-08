package Java_Object_Class.Oops;

// Java program for demonstrating the features and functionalities of OOP concepts in Java.    
class ExampleAnimal {    
    private String name;    
    // Constructor    
    public ExampleAnimal(String name) {    
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
class ExampleDog extends ExampleAnimal {    
    // Constructor    
    public ExampleDog(String name) {    
        super(name);    
    }    
    // Polymorphism: Overriding method    
    @Override    
    public void makeSound() {    
        System.out.println("Woof");    
    }    
}    
// Derived class (Inheritance)    
class ExampleCat extends ExampleAnimal {    
    // Constructor    
    public ExampleCat(String name) {    
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
        ExampleDog dog = new ExampleDog("Buddy");    
        ExampleCat cat = new ExampleCat("Whiskers");    
        // Accessing methods of the base class through objects of derived classes    
        System.out.println("Dog name: " + dog.getName());    
        dog.makeSound();    
        System.out.println("Cat name: " + cat.getName());    
        cat.makeSound();    
    }    
}    