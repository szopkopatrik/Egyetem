package hu.unideb.inf.PackageAnimals;

import hu.unideb.inf.PackageAbstrctAnimals.PetMammal;
import hu.unideb.inf.PackageAbstrctAnimals.ProtectedAnimal;

import java.util.ArrayList;

public class GilaMonster extends PetMammal implements ProtectedAnimal{

    private String lawNumber;
    public GilaMonster(String name,String lawNumber) {
        super(name, 10, null);
        this.lawNumber = lawNumber;
    }

    @Override
    public String makeSound() {
        return "Rasengaaaan";
    }

    @Override
    public ArrayList<String> getActivityList() {
        return null;
    }

    @Override
    public String getLawNumber() {
        return lawNumber;
    }
}
