
package Q_Spider_327.OOPS.Abstraction;

public class Employee extends Person {
    int empId = 101;
    String Company = "Tata";

    void displayEmployee() {
        System.out.println("Emp ID " + empId);
        System.out.println("Company " + Company);

    }

    public void work() {
        System.out.println("Empolyee is working .");
    }

    public void walk() {
        System.out.println("Employee is walking.");
    }

    public void run() {
        System.out.println("Employee is running.");
    }

    public void sleep() {
        System.out.println("Employee is sleeping.");

    }

    // super call

    Employee() {
        super();
    }

    Employee(String name, String add, int empId, String Company) {
        super(name, add);
        this.empId = empId;
        this.Company = Company;
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