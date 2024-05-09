public abstract class WheelableTransport extends Transport implements Wheelable{

    private int wheelsCount;

    public WheelableTransport(String modelName, int wheelsCount) {
        super(modelName);
        this.wheelsCount = wheelsCount;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
