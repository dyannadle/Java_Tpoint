
package Q_Spider_327.OOPS.Abstraction;

public class Employee extends Person {
    int empId = 101;
    String Company = "Tata";

    void displayEmployee() {
        System.out.println("Emp ID " + empId);
        System.out.println("Company " + Company);

    }

    void work() {
        System.out.println("Empolyee is working .");
    }

    @Override
    void walk() {
        System.out.println("Employee is walking.");
    }

    @Override
    void run() {
        System.out.println("Employee is running.");
    }

    @Override
    void sleep() {
        System.out.println("Employee is sleeping.");

    }

    public static void main(String[] args) {

        Employee e = new Employee();
        e.displayPerson();
        e.displayEmployee();
        e.walk();
        e.run();
        e.sleep();
        e.work();
    }
}