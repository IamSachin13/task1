
class Person1 {
    protected String name;
    protected int age;

    
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person1 {
    private int employeeID;
    private double salary;

    
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); 
        this.employeeID = employeeID;
        this.salary = salary;
    }

    
    public void displayEmployeeInfo() {
        displayPersonInfo(); 
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}


public class inherit1 {
    public static void main(String[] args) {
    
        Employee emp = new Employee("Alice", 30, 101, 75000);

    
        emp.displayEmployeeInfo();
    }
}
