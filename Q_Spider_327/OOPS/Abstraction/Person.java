package Q_Spider_327.OOPS.Inheritance;

abstract class Person {
    String name = "Deep";
    String add = "Hyd";

    void displayPerson(){
        System.out.println("Name "+name);
        System.out.println("Address "+add);
    }

    abstract void walk();

    abstract void run();

    abstract void sleep();

}
