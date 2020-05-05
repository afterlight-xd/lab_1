public class GamingWireMice extends WireMice{
    private boolean macros;
    private String LEDType;

    public String getLEDType() {
        return LEDType;
    }

    public void setLEDType(String LEDType) {
        this.LEDType = LEDType;
    }

    public boolean isMacros() {
        return macros;
    }

    public void setMacros(boolean macros) {
        this.macros = macros;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public GamingWireMice(String name, int cost, String interfaceType, String manufacturer, double cableLength, String cableType, boolean macros, String LEDType) {
        super(name, cost, interfaceType, manufacturer, cableLength, cableType);
        this.macros = macros;
        this.LEDType = LEDType;
    }

}
