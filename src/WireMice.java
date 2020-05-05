public class WireMice extends Mice {
    private double cableLength;
    private String cableType;

    public String getCableType() {
        return cableType;
    }

    public void setCableType(String cableType) {
        this.cableType = cableType;
    }

    public double getCableLength() {
        return cableLength;
    }

    public void setCableLength(double cableLength) {
        this.cableLength = cableLength;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public WireMice(String name, int cost, String interfaceType, String manufacturer, double cableLength, String cableType) {
        super(name, cost, interfaceType, manufacturer);
        this.cableLength = cableLength;
        this.cableType = cableType;
    }
}
