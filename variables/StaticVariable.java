package variables;

class StudentStatic {
    static int age;
}

public class StaticVariable {
    public static void main(String[] args) {
        // Instances are not needed for static variables
        // StudentStatic s1 = new StudentStatic();
        // StudentStatic s2 = new StudentStatic();
        
        // Accessing static variable correctly using Class Name
        StudentStatic.age = 25; 
        System.out.println("student age after setting to 25: " + StudentStatic.age);
        
        StudentStatic.age = 30;
        System.out.println("student age after setting to 30: " + StudentStatic.age);
        
        StudentStatic.age = 35; 
        System.out.println("Final student age: " + StudentStatic.age);
    }
}
