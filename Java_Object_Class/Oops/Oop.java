package Java_Object_Class.Oops;

class pen {
    String colour;
    String type;

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColour() {
        System.out.println(this.colour);

    }

}

// class Student{
// String name;
// int age;

// public void printInfo(){
// System.out.println(this.name);
// System.out.println(this.age);
// }
// }

public class Oop {

    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.colour = "black";
        pen1.type = "blue";

        pen pen2 = new pen();
        pen2.colour = "blue";
        pen2.type = "gel";
        
        pen1.write();
        pen1.printColour();
        
        pen2.write();
        pen2.printColour();
    }
}
