import java.util.Objects;

public class Vehicle {
    private enum VehicleStatus{
        MOVE,STOP,PARK
    }
    private VehicleStatus status;
    private int numberOfWheels;
    private String id;

    public Vehicle (String id){
        this.id = id;
    }
    public Vehicle(String id,int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
        this.id = id;
    }

    public void setMove(VehicleStatus status){
        this.status = VehicleStatus.MOVE;
    }
    public void setStop(VehicleStatus status){
        this.status = VehicleStatus.STOP;
    }
    public void setPark(VehicleStatus status){
        this.status = VehicleStatus.PARK;
    }

    public VehicleStatus getStatus(){
        return this.status;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels = numberOfWheels;
    }

    public String getId(){
        return this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "status=" + status +
                ", numberOfWheels=" + numberOfWheels +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (numberOfWheels != vehicle.numberOfWheels) return false;
        if (status != vehicle.status) return false;
        return Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        int result = status != null ? status.hashCode() : 0;
        result = 31 * result + numberOfWheels;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
