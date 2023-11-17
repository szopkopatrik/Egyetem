public class EgyenloOldaluHaromsog extends Sokszog{
    private double oldalhossz;

    public EgyenloOldaluHaromsog(double oldalhossz){
        super(3);
        this.oldalhossz = oldalhossz;
    }


    @Override
    public double getTerulet() {
        return oldalhossz*oldalhossz*Math.sqrt(3)/4;
    }

    @Override
    public double getKerulet() {
        return 3*oldalhossz;
    }

    public double getOldalhossz(){
        return oldalhossz;
    }

    @Override
    public String toString() {
        return "EgyenloOldaluHaromsog{" +
                "oldalhossz=" + oldalhossz +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EgyenloOldaluHaromsog that = (EgyenloOldaluHaromsog) o;

        return Double.compare(oldalhossz, that.oldalhossz) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(oldalhossz);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
