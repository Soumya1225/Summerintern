package Employee.dao;

import Employee.model.Employee;

public interface EmployeeDAO {

    void addEmployee(Employee employee);

    void viewEmployees();

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);
}