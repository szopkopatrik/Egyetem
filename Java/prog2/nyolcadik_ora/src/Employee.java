import Exceptions.DeptNotContainEmpException;
import Exceptions.WrongBirthDateException;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable{
    private int id;
    private Department department;

    public Employee(int id, String name, LocalDate birthDate) throws WrongBirthDateException {
        super(name, birthDate);
        this.id = id;
    }

    public Employee(int id, String name, LocalDate birthDate, String nickName) throws WrongBirthDateException{
        super(name, birthDate, nickName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department dept) throws DeptNotContainEmpException{
        if(dept == null) {
            this.department = null;
            return;
        }

        if(!dept.getEmployees().contains(this)) {
            throw new DeptNotContainEmpException("no employee in dept: " + department);
        }

        for (Employee emp : dept.getEmployees()) {
            if(emp.equals(this)) {
                this.department = dept;
                break;
            }
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", departmentId='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;
        if (id != employee.id) return false;
        return Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }
}
