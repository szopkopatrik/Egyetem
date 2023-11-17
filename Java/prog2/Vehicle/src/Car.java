public class Car extends Vehicle{

    private boolean enginersWorking;
    private int horsePower;
    public Car(String licensePlate,String id) {
        super(id,4);
    }

    public Car(String licensePlate,int horsePower){
        super(licensePlate);
        this.horsePower = horsePower;
    }

    public void  setHorsePower(int horsePower){
        this.horsePower=horsePower;
    }

    public boolean isEnginersWorking(){
        return this.enginersWorking;
    }

    public void setEngineToWork(boolean enginersWorking){
        enginersWorking=true;
    }

    public void setEngineToStop(boolean enginersWorking){
        enginersWorking=false;
    }

    public  void setMove(boolean enginersWorking){
        this.enginersWorking = true;
    }

    public void setStop(boolean enginersWorking){
        this.enginersWorking = true;
    }

    public void setPark(boolean enginersWorking){
        this.enginersWorking = false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "enginersWorking=" + enginersWorking +
                ", horsePower=" + horsePower +
                '}';
    }
}
