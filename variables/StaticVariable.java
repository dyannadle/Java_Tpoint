class Student {
    static int age;
}

public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student(); // accessing static variable
        Student s2 = new Student();
        s1.age = 25;
        s2.age = 30;
        Student.age = 35; // modifying static variable using class name
        System.out.println("student age: " + s1.age);
        System.out.println("student age: " + s2.age);
    }
}
