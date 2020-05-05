public abstract class Mice extends ComputerPeriphery {
    private String sensor;
    private String DPIRange;
    private int numberOfButtons;

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    public String getDPIRange() {
        return DPIRange;
    }

    public void setDPIRange(String DPIRange) {
        this.DPIRange = DPIRange;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Mice(String name, int cost, String interfaceType, String manufacturer) {
        super(name, cost, interfaceType, manufacturer);
    }
}
