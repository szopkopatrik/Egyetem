public class Negyzet extends Teglalap{
    public Negyzet(double oldalhossz) {
        super(oldalhossz,oldalhossz);
    }

    public double getOldalhossz(){
        return super.getHosszabboldal();
    }

    @Override
    public String toString() {
        return "Oldalhossz: " + super.getHosszabboldal();
    }
}
