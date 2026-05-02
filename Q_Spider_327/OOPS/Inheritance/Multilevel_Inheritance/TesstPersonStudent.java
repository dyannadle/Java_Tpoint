package Q_Spider_327.OOPS.Inheritance.Multilevel_Inheritance;

public class TesstPersonStudent {
    public static void main(String[] args) {
        EngineeringStudent e = new EngineeringStudent();
        Student s = e;
        System.out.println(e.name);
        System.out.println(e.sid);
        System.out.println(e.Stream);
        Person p = s;
        System.out.println(p.name);
    }
}
