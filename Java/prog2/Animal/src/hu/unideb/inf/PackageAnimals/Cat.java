package hu.unideb.inf.PackageAnimals;

import hu.unideb.inf.PackageAbstrctAnimals.PetMammal;

import java.util.ArrayList;

public class Cat extends PetMammal {

    public Cat(String name){
        super(name,4,"Igen");
    }
    @Override
    public String makeSound() {
        return "Miau";
    }

    @Override
    public ArrayList<String> getActivityList() {
        return null;
    }


    public String getHome(){
        return super.getHome();
    }


    public void setHome(String home){
        super.setHome(home);
    }
}
