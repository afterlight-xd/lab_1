public class GamingWirelessMice extends WirelessMice {
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

    public GamingWirelessMice(String name, int cost, String interfaceType, String manufacturer, boolean macros, String LEDType) {
        super(name, cost, interfaceType, manufacturer);
        this.macros = macros;
        this.LEDType = LEDType;
    }
}
