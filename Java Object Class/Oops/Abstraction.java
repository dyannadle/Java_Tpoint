abstract class Animal {  
    abstract void makeSound();  
    // Creating a Concrete method   
    void breathe() {  
        System.out.println("Animal is breathing...");  
    }  
}  
// Concrete subclass  
class Dog extends Animal {  
    // implementation for an abstract method  
    @Override  
    void makeSound() {  
        System.out.println("Dog barking");  
    }  
}  
public class Abstraction {  
    public static void main(String[] args) {  
        Animal myDog = new Dog();  
        myDog.breathe();  
        myDog.makeSound();  
    }  
}  