public class InstanceVariable {
    public String name;
    public int age = 20; // instance variable

    public InstanceVariable() {
        this.name = "Deepak Yannadle"; // initializing instance variable
    }
}

class Main {
    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        System.out.println("student name: " + obj.name);
        System.out.println("student age: " + obj.age);
    }
}
