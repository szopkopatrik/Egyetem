package hu.unideb.inf.PackageAnimals;

import hu.unideb.inf.PackageAbstrctAnimals.Pet;

public class Snake implements Pet,Comparable<Snake> {
    private double speedInMeterPerSec;
    private String name;

    public Snake(double speedInMeterPerSec){
        this.speedInMeterPerSec = speedInMeterPerSec;
    }
    @Override
    public String makeSound() {
        return "hasszaaaah";
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int compareTo(Snake o) {
        if (this.speedInMeterPerSec < o.speedInMeterPerSec){
            return -1;
        }

        if (this.speedInMeterPerSec > o.speedInMeterPerSec){
            return 1;
        }
        else{
            return 0;
        }
    }

    public double getSpeedInMeterPerSec() {
        return speedInMeterPerSec;
    }
}
