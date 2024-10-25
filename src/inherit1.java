// Base class Person
class Person1 {
    protected String name;
    protected int age;

    // Constructor for Person class
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Method to display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Employee that extends Person
class Employee extends Person1 {
    private int employeeID;
    private double salary;

    // Constructor for Employee class using super to initialize name and age
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Initialize name and age using the super class constructor
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        displayPersonInfo(); // Display name and age from Person class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

// Main class to test the implementation
public class inherit1 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Alice", 30, 101, 75000);

        // Display employee information
        emp.displayEmployeeInfo();
    }
}
