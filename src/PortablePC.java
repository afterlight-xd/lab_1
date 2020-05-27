public class PortablePC extends PersonalComputer {
    double batteryCapacity;

    public PortablePC() {
        super();
    }

    @Override
    public int getCost() {
        return 35000;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
