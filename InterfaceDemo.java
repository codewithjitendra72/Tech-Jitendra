interface Employee {
    void display();
}

class EmployeeDetails implements Employee {
    String name = "Jitendra";
    String department = "Computer Science";
    int age = 18;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        EmployeeDetails e = new EmployeeDetails();
        e.display();
    }
}