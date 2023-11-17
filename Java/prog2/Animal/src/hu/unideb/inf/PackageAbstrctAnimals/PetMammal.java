package hu.unideb.inf.PackageAbstrctAnimals;

import java.util.ArrayList;
import java.util.List;

public abstract class PetMammal implements Pet,Vertebrates{

    protected String name;
    private int numberOflegs;
    private String home;

    public PetMammal(String name, int numberOflegs,String home){
        this.name = name;
        this.numberOflegs = numberOflegs;
        this.home = home;
    }


    abstract public String makeSound();

    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOflegs;
    }


    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public abstract ArrayList<String> getActivityList();

    @Override
    public int compareTo(Vertebrates o) {
        if(this.numberOflegs < o.getNumberOfLegs()){
            return -1;
        }
        if (this.numberOflegs > o.getNumberOfLegs()){
            return 1;
        }
        else return 0;
    }
}
