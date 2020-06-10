package hierarchy;
import factory.*;

public class PortablePC extends PersonalComputer {
    private double batteryCapacity;

    public PortablePC(PCfactory factory) {
        super(factory);
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
