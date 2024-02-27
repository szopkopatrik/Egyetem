import Exceptions.DeptNotContainEmpException;
import Exceptions.SizeException;
import Exceptions.WrongBirthDateException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;


public class MainAllCompanyOutObjectIo {

    public static void main(String[] args) throws WrongBirthDateException, SizeException, DeptNotContainEmpException {
        ArrayList<Company> companyList = new ArrayList<>();

        Company c1 = new Company("EPAM", "BZS");
        Company c2 = new Company("Neuron", "BL");
        Company c3 = new Company("CodeYard", "CsLUI");

        Department d2 = new Department("1E", "IT");

        d2.addEmployee(new Employee(1, "Anna", LocalDate.of(1999, 1, 1)));
        d2.addEmployee(new Employee(2, "Bela", LocalDate.of(2000, 5, 1), "Beluska"));
        c1.addDepartment(d2);

        Department d1 = new Department("2E", "Sales");
        c1.addDepartment(d1);
        d1.addEmployee(new Employee(30, "Cili", LocalDate.of(2018, 3, 3), "Cilike"));

        d1 = new Department("3E", "HR");
        d1.addEmployee(new Employee(40, "Dini", LocalDate.of(2017, 4, 4)));
        c1.addDepartment(d1);

        d1 = new Department("1N", "HR");
        d1.addEmployee(new Employee(40, "Dini", LocalDate.of(2017, 4, 4)));
        c2.addDepartment(d1);

        d1 = new Department("2N", "IT");
        d1.addEmployee(new Employee(50, "Elemer", LocalDate.of(2020, 5, 5)));
        c2.addDepartment(d1);

        d1 = new Department("1CY", "Mobil");
        EmployeeWithSizes ew = new EmployeeWithSizes(60, "Ferenc", LocalDate.of(2020, 6, 6));
        ew.setHeightInCm(200);
        ew.setShoeSize(40);
        d1.addEmployee(ew);
        c3.addDepartment(d1);

        d1 = new Department("2CY", "Web");
        ew = new EmployeeWithSizes(70, "Geza", LocalDate.of(2020, 7, 7));
        ew.setHeightInCm(200);
        ew.setShoeSize(39);
        d1.addEmployee(ew);
        c3.addDepartment(d1);

        companyList.add(c1);
        companyList.add(c2);
        companyList.add(c3);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CompanyAllObj.bin"))) {
            for (Company company : companyList) {
                System.out.println(company);
                oos.writeObject(company);
            }

//			for (Employee emp:d2.getEmployees()) {
//				oos.writeObject(emp);
//			}

        } catch (IOException e) {
            System.out.println("kivetel");
            System.out.println(e.getMessage());
            System.out.println(e.getSuppressed());
            System.out.println(e.getLocalizedMessage());
        }

    }
}
