package hu.unideb.inf.PackageAnimals;

import hu.unideb.inf.PackageAbstrctAnimals.PetMammal;

import java.util.ArrayList;

public class Dog extends PetMammal {

    public Dog(String name){
        super(name,4,"Hungary");
    }
    @Override
    public String makeSound() {
        return "vauvau";
    }

    @Override
    public ArrayList<String> getActivityList() {
        return null;
    }
}
