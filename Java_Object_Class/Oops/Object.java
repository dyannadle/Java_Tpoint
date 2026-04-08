package Java_Object_Class.Oops;

class ObjectDog {
    String name;
    void bark() {
        System.out.println(name + " says Woof");
    }
}   
public class Object {
    public static void main(String []args) {
        ObjectDog myDog = new ObjectDog();
        myDog.name = "Rocky";
        myDog.bark();
        
    }
}