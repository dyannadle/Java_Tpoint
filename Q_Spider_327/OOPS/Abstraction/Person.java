package Q_Spider_327.OOPS.Abstraction;

abstract class Person {
    String name = "Deep";
    String add = "Hyd";

    // Default constructor
    Person() {
    }

    // Parameterized constructor
    Person(String name, String add) {
        this.name = name;
        this.add = add;
    }

    void displayPerson(){
        System.out.println("Name "+name);
        System.out.println("Address "+add);
    }

    abstract void walk();

    abstract void run();

    abstract void sleep();

}
