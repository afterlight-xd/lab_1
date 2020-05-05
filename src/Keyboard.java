public abstract class Keyboard extends ComputerPeriphery {
    private int numberOfKeys;
    private String switchType;

    public String getSwitchType() {
        return switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Keyboard(String name, int cost, String interfaceType, String manufacturer, int numberOfKeys, String switchType) {
        super(name, cost, interfaceType, manufacturer);
        this.numberOfKeys = numberOfKeys;
        this.switchType = switchType;
    }
}
