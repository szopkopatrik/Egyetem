import java.util.*;

public class Main {
    public static void main(String[] args) {
        Negyzet probanegyzet1 = new Negyzet(10D);
        System.out.println(probanegyzet1.toString());

        Negyzet probanegyzet2 = new Negyzet(22D);
        System.out.println(probanegyzet2.toString());
        System.out.println(probanegyzet1.getKerulet());
        System.out.println(probanegyzet2.getTerulet());

        EgyenloOldaluHaromsog harom1 = new EgyenloOldaluHaromsog(2D);
        System.out.println(harom1.getKerulet());
        System.out.println(harom1.getTerulet());

        Teglalap tegla1 = new Teglalap(2D,2D);
        System.out.println(tegla1.getTerulet());


        Teglalap probateglalap1 = new Teglalap(3.50,2);
        Teglalap probateglalap2 = new Teglalap(4,6);
        Teglalap probateglalap3 = new Teglalap(5,3);

        List<Teglalap> teglalapok = new ArrayList<>();

        teglalapok.add(probateglalap1);
        teglalapok.add(probateglalap2);
        teglalapok.add(probateglalap3);

        Arrays.sort(new List[] {teglalapok});
        System.out.println(teglalapok);
        Collections.sort(teglalapok);
        System.out.println(teglalapok);
    }
}