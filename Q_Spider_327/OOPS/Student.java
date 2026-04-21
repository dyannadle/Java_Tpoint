package Q_Spider_327.OOPS;

public class Student {
    // Add student attributes here
    public String name;
    public int age;
    String sid;

    public Student(String name) {
        this.name = name;
    }

    // Default zero-argument constructor
    public Student() {
    }

    public Student(String sid, int age) {
        this.sid = sid;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student[name=" + name + "]";
    }
}
