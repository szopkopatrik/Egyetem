import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teglalap extends Sokszog implements Comparable<Teglalap>{

    private double hosszabboldal;
    private double rovodebboldal;

    public Teglalap(double hosszabboldal, double rovodebboldal){
        super(4);
        this.hosszabboldal = hosszabboldal;
        this.rovodebboldal = rovodebboldal;
    }

    @Override
    public double getTerulet() {
        return 2 * (rovodebboldal);
    }

    @Override
    public double getKerulet() {
        return rovodebboldal * hosszabboldal;
    }

    public double getHosszabboldal(){
        return hosszabboldal;
    }
    public double getRovodebboldal(){
        return hosszabboldal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Teglalap teglalap = (Teglalap) o;

        if (Double.compare(hosszabboldal, teglalap.hosszabboldal) != 0) return false;
        return Double.compare(rovodebboldal, teglalap.rovodebboldal) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(hosszabboldal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rovodebboldal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Teglalap{" +
                "hosszabboldal=" + hosszabboldal +
                ", rovodebboldal=" + rovodebboldal +
                '}';
    }

    @Override public int compareTo(Teglalap o){
        if (this.hosszabboldal < o.hosszabboldal){
            return  -1;
        }
        if (this.hosszabboldal > o.hosszabboldal){
            return 1;
        }else {
            return 0;
        }
    }

}
