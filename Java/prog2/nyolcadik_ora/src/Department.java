import Exceptions.DeptNotContainEmpException;

import java.util.HashSet;

public class Department {
    private String id;
    private String name;
    private HashSet<Employee> employees;


    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) throws DeptNotContainEmpException {
        employee.setDepartment(this);
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) throws DeptNotContainEmpException {
        employee.setDepartment(null);
        this.employees.remove(employee);
    }

    public static void employeeMove(Employee emp, Department fromDept, Department toDept) throws DeptNotContainEmpException {
        fromDept.removeEmployee(emp);
        toDept.addEmployee(emp);
    }
}
