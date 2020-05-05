public class WirelessMice extends Mice{
    private String batteryType;
    private double batteryCapacity;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public WirelessMice(String name, int cost, String interfaceType, String manufacturer) {
        super(name, cost, interfaceType, manufacturer);
    }
}
