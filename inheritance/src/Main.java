import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee employee = new Employee();
        employee.name = s.nextLine();
        employee.address = s.nextLine();
        employee.age = s.nextInt();
        employee.phoneNumber = s.next();
        employee.salary = s.nextLong();
        employee.specialization = s.next();

        Manager manager = new Manager();
        Scanner m = new Scanner(System.in);
        manager.name = m.nextLine();
        manager.address = m.nextLine();
        manager.age = m.nextInt();
        manager.phoneNumber = m.next();
        manager.salary = m.nextLong();
        manager.department = m.next();

        System.out.println("Employee details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}