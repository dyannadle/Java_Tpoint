class Dog{
    String name;
    void bark(){
        System.out.println(name + " says Woof");
    }
}   
public class main{
    public static void main(String []args) {
        Dog myDog = new Dog();
        myDog.name = "Rocky";
        myDog.bark();
        
    }
}