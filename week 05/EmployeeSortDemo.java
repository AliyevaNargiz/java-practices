import java.util.*;

class Employee {
    String firstname;
    int age;
    double salary;
    Employee(String firstname, int age, double salary) {
        this.firstname = firstname;
        this.age = age;
        this.salary = salary;
    }
    public String toString() {
        return firstname + ", age " + age + ", salary " + salary;
    }
    public String getFirstname() { return firstname; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
}

public class EmployeeSortDemo {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Nargiz", 21, 5000),
            new Employee("Diego", 24, 6000),
            new Employee("Tessa", 21, 5500)
        };
        System.out.println("Original: " + Arrays.toString(employees));

        // Sort by firstname (lambda)
        Arrays.sort(employees, (e1, e2) -> e1.firstname.compareTo(e2.firstname));
        System.out.println("Sorted by firstname: " + Arrays.toString(employees));

        // Sort by age (method reference)
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        System.out.println("Sorted by age: " + Arrays.toString(employees));

        // Sort by salary (lambda)
        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("Sorted by salary: " + Arrays.toString(employees));
    }
} 