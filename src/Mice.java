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
}
