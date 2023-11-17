import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*

        while (sc.hasNext()) {
            out.println("Kérek egy szöveget: ");
            String x = sc.next();
            out.println("Ezt írtad be: " + x);
            out.println("Kérek egy szöveget: ");
        }


        sc.close();

        for (int i = 0; i < args.length; i++){
            out.println(args[i]);
        }
        */
        // zoltan_pal1@epam.com

        //gyak2:
        double[] array = new double[10];


        for (int i = 0;i < array.length;++i){
            out.println("Kérek számokat: ");
            array[i] = sc.nextDouble();
        }

        out.println("A tömb minimuma: " + Arrays.stream(array).min());
        out.println("A tömb maximuma: " + Arrays.stream(array).max());
        out.println("A tömb összege: " + Arrays.stream(array).sum());
        out.println("A tömb atlaga: " + Arrays.stream(array).average());
        Arrays.sort(array);
        out.println(Arrays.toString(array));


    }
}