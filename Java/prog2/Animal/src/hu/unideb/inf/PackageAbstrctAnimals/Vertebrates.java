package hu.unideb.inf.PackageAbstrctAnimals;

public interface Vertebrates extends Animal, Comparable<Vertebrates>{
    int getNumberOfLegs();


    int compareTo(Vertebrates o);
}
