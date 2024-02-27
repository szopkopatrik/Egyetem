import Exceptions.WrongBirthDateException;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private String nickName;
    public Person(String name, LocalDate birthDate) throws WrongBirthDateException {
        super();
        this.name = name;
        int age = LocalDate.now().getYear() - birthDate.getYear();
        //System.out.println(LocalDate.now().getYear() - birthDate.getYear());
        if(age < 65 && age > 18) {
            this.birthDate = birthDate;
        }
        else throw new WrongBirthDateException("The age should be between 18 and 65: "+birthDate);
    }

    public Person(String name, LocalDate birthDate, String nickName) throws WrongBirthDateException{
        this(name, birthDate);      //elso konstruktort meghivjuk
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
