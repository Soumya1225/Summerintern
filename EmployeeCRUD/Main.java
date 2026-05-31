package Employee;

import Employee.dao.EmployeeDAO;
import Employee.dao.EmployeeDAOImpl;
import Employee.model.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDAO dao = new EmployeeDAOImpl();

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp =
                            new Employee(name, department, salary);

                    dao.addEmployee(emp);

                    break;

                case 2:

                    dao.viewEmployees();

                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDept = sc.nextLine();

                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();

                    Employee updateEmp =
                            new Employee(id,
                                    newName,
                                    newDept,
                                    newSalary);

                    dao.updateEmployee(updateEmp);

                    break;

                case 4:

                    System.out.print("Enter Employee ID to Delete: ");

                    int deleteId = sc.nextInt();

                    dao.deleteEmployee(deleteId);

                    break;

                case 5:

                    System.out.println("Application Closed.");

                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}