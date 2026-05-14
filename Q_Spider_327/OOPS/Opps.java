package Q_Spider_327.OOPS;

// Abstraction
abstract class Employee {
    // Encapsulation (private data)
    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    // Abstract method (Abstraction)
    public abstract double calculateSalary();

    // Common method
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

// Inheritance
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Polymorphism (Method Overriding)
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Inheritance
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Polymorphism (Method Overriding)
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Opps {
    public static void main(String[] args) {

        // Polymorphism
        Employee emp1 = new FullTimeEmployee("Rahul", 101, 50000);
        Employee emp2 = new PartTimeEmployee("Priya", 102, 5, 500);

        emp1.displayInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println("---------------------");

        emp2.displayInfo();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}
