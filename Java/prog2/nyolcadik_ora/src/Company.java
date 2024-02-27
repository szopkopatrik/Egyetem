import java.util.TreeSet;

public class Company implements Comparable{
    private String name;
    private String nameOfLeader;
    private TreeSet<Department> departments = new TreeSet<>();

    public Company(String name, String nameOfLeader) {
        super();
        this.name = name;
        this.nameOfLeader = nameOfLeader;
    }

    public String getName() {
        return this.name;
    }

    public String getNameOfLeader() {
        return this.nameOfLeader;
    }

    public void setNameOfLeader(String nameOfLeader) {
        this.nameOfLeader = nameOfLeader;
    }

    public TreeSet<Department> getDepartments() {
        return this.departments;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void removeDepartment(Department dept) {
        this.departments.remove(dept);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", nameOfLeader='" + nameOfLeader + '\'' +
                ", departments=" + departments +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
