import java.io.*;
import java.util.ArrayList;

public class MainAllCompanyInObject {
    public static void main(String[] args) {
        ArrayList<Company> companyList = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CompanyAllObj.txt"))) {
            while (true) {
                Company c = (Company) ois.readObject();
                // System.out.println(c);
                companyList.add(c);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("befejezte");
        }

        for (Company company : companyList) {
            System.out.println(company);
        }
    }
}
