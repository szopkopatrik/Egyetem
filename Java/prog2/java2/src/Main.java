import Kozonseges_tort.ktort;

public class Main {

    public static void main(String[] args) {
        ktort ktort = new ktort(2,1);
        ktort ktort2 = new ktort(2);
        System.out.println(ktort2.getNevező());
        ktort2.setSzamlalo(6);
        System.out.println(ktort);
        System.out.println(ktort.equals(new ktort(3,1)));
        System.out.println(ktort.egeszSzorzas(2));
        
    }

}