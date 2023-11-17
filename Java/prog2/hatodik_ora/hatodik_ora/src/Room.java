import java.util.ArrayList;

public class Room {
    private Building building;
    private String roomId;
    private int numberOfSeats;

    private ArrayList<String> attributes;


    public Room(Building building, String roomId) {
        this.building = building;
        this.roomId = roomId;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void addAttribute(String attr) {
        this.attributes.add(attr);
    }

    public void delAttribute(String attr) {
        attributes.remove(attr);
    }

    public Building getBuilding() {
        return this.building;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public ArrayList<String> getAttributes() {
        return this.attributes;
    }
    @Override
    public String toString() {
        return "Room{" +
                "building=" + building +
                ", roomId='" + roomId + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", attributes=" + attributes +
                '}';
    }
}
