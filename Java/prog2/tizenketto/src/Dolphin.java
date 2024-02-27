public class Dolphin implements Animal{
    private String name;

    public Dolphin(String noise) {
        this.name = noise;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoise() {
        return name;
    }

    @Override
    public String makeNoise() {
        return "k k k k k k k k";
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "name='" + name + '\'' +
                '}';
    }
}
