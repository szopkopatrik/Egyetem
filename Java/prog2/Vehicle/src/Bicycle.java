public class Bicycle extends Vehicle{

    private int size;
    public Bicycle(String registrationNumber, String id) {
        super(id,2);
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "size=" + size +
                '}';
    }
}
