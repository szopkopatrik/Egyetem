public abstract class Sokszog {
    private int szogekSzama;

    public Sokszog(int szogekSzama) {
        super();
        this.szogekSzama = szogekSzama;
    }

    public abstract double getTerulet();
    public abstract double getKerulet();

    public int getSzogekSzama(){
        return this.szogekSzama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sokszog sokszog = (Sokszog) o;

        return szogekSzama == sokszog.szogekSzama;
    }

    @Override
    public int hashCode() {
        return szogekSzama;
    }

    @Override
    public String toString() {
        return "Sokszog{" +
                "szogekSzama=" + szogekSzama +
                '}';
    }
}
