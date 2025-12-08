class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
    void sound(String type){
        System.out.println("Animal makes a sound of type: " + type);
    }
}

class Dog extends Animal{
    @Override
    void sound(String type){
        System.out.println("Animal Sound : " + type);
    }
}
public class Polymorphism{
    public static void main(String [] args){
        Animal a = new Animal();
        
        Dog d = new Dog();
        Animal poly = new Dog(); //upcasting
        //method overloading
        a.sound();
        a.sound("Generic");
        d.sound("Bark");
        poly.sound("Woof");
    }
}