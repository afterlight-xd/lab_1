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
}
