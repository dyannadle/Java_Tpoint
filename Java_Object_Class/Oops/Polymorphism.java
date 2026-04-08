package Java_Object_Class.Oops;

class PolyAnimal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void sound(String type) {
        System.out.println("Animal makes a sound of type: " + type);
    }
}

class PolyDog extends PolyAnimal {
    @Override
    void sound(String type) {
        System.out.println("Animal Sound : " + type);
    }
}
public class Polymorphism {
    public static void main(String [] args) {
        PolyAnimal a = new PolyAnimal();
        
        PolyDog d = new PolyDog();
        PolyAnimal poly = new PolyDog(); // upcasting
        
        // method overloading
        a.sound();
        a.sound("Generic");
        d.sound("Bark");
        poly.sound("Woof");
    }
}