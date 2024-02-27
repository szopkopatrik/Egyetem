import Exceptions.WrongBirthDateException;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //beolvas1();
        beolvas2();


    /*
        Person person = null;
        try {
            person = new Person("John Doe", LocalDate.of(1898, 10, 10));
        } catch (WrongBirthDateException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Happens every time!");
            System.out.println(person);
        }
    */
    }

    private static void beolvas1() {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("deik", "Botond"));
        companies.add(new Company("btk", "Fritzgeralt"));
        companies.add(new Company("ttk", "Józsi"));
        companies.add(new Company("ni it", "Bözsi"));
        companies.add(new Company("epam", "Seherezádé"));

        //try with resources
        try (Formatter fm = new Formatter(new File("company.txt"))){
            for(Company comp : companies) {
                fm.format("%s; %s\n", comp.getName(), comp.getNameOfLeader());
            }
        } catch (FileNotFoundException fnfe){
            System.out.println("File not found: " + fnfe.getMessage());
        }
    }

    private static void beolvas2() {
        List<Company> companies = new ArrayList<>();
        File file = new File("company.txt");

        try (Scanner scr = new Scanner(file)) {
            while(scr.hasNext()) {
                String line = scr.nextLine();
                String[] lineArray = line.split("; ");
                companies.add(new Company(lineArray[0], lineArray[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found: " + e.getMessage());
        }

        for(Company comp : companies) {
            System.out.println(comp);
        }
    }
}