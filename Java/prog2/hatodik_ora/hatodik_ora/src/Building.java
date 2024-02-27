import java.util.Objects;

public class Building implements Comparable<Building> {
    private String name;

    private String address;

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Building building = (Building) o;

        if (!Objects.equals(name, building.name)) return false;
        return Objects.equals(address, building.address);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }


    @Override
    public int compareTo(Building o) {
        return this.name.toLowerCase().compareTo(o.name.toLowerCase());
    }
}
