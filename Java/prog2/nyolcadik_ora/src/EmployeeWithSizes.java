import Exceptions.WrongBirthDateException;

import java.time.LocalDate;

public class EmployeeWithSizes extends Employee{
    private int shoeSize;
    private int heightInCm;
    public EmployeeWithSizes(int id, String name, LocalDate birthDate) throws WrongBirthDateException {
        super(id, name, birthDate);
    }

    public EmployeeWithSizes(int id, String name, LocalDate birthDate, String nickName) throws WrongBirthDateException {
        super(id, name, birthDate, nickName);
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeWithSizes{");
        sb.append("shoeSize=").append(shoeSize);
        sb.append(", heightInCm=").append(heightInCm);
        sb.append('}');
        return sb.toString();
    }
}
