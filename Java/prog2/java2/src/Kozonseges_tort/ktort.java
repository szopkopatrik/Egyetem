package Kozonseges_tort;

import java.util.Objects;

public class ktort {


    private static int sorszam;
    private int szamlalo;
    private int nevező;

    public ktort() {
        sorszam++;

    }
    public ktort(int egesz){
        this.szamlalo = egesz;
        this.nevező = 1;
    }

    public ktort(int szamlalo,int nevező){
        this.szamlalo = szamlalo;
        this.nevező = nevező;
    }
    public int getSzamlalo() {
        return szamlalo;
    }
    public int getNevező() {
        return nevező;
    }

    public void setSzamlalo(int szamlalo) {
        this.szamlalo = szamlalo;
    }
    public void setNevező(int nevező) {
        this.nevező = nevező;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ktort={");
        builder.append("szamlalo: " + szamlalo);
        builder.append(" nevező: " + nevező);
        builder.append("}");
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ktort ktort = (ktort) o;
        return szamlalo == ktort.szamlalo && nevező == ktort.nevező;
    }

    @Override
    public int hashCode() {
        return Objects.hash(szamlalo, nevező);
    }

    public static int getSorszam() {
        return sorszam;
    }

    public static void setSorszam(int sorszam) {
        ktort.sorszam = sorszam;
    }
    public int egeszSzorzas(int szam){
        return (szamlalo *= szam);
    }



}
