package Employee.dao;

import Employee.model.Employee;
import Employee.util.DBConnection;

import java.sql.*;

public class EmployeeDAOImpl implements EmployeeDAO {

    Connection con = DBConnection.getConnection();

    @Override
    public void addEmployee(Employee employee) {

        String sql =
                "INSERT INTO employee(name,department,salary) VALUES(?,?,?)";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDepartment());
            ps.setDouble(3, employee.getSalary());

            ps.executeUpdate();

            System.out.println("Employee Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void viewEmployees() {

        String sql = "SELECT * FROM employee";

        try {

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(sql);

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id")
                                + " "
                                + rs.getString("name")
                                + " "
                                + rs.getString("department")
                                + " "
                                + rs.getDouble("salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(Employee employee) {

        String sql =
                "UPDATE employee SET name=?, department=?, salary=? WHERE id=?";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDepartment());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getId());

            ps.executeUpdate();

            System.out.println("Employee Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {

        String sql =
                "DELETE FROM employee WHERE id=?";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Employee Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}