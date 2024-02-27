public class Cat implements Animal{
    private String name;

    public Cat(String noise) {
        this.name = noise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "noise='" + name + '\'' +
                '}';
    }

    @Override
    public String makeNoise() {
        return name;
    }
}
