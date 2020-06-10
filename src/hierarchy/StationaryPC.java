package hierarchy;
import factory.*;

public class StationaryPC extends PersonalComputer {
    private String powerSupply="KAS 2000W";
    private int powerSupplyWatts=2000;

    @Override
    public int getCost() {
        return 70000;
    }

    public StationaryPC(PCfactory factory) {
        super(factory);
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public int getPowerSupplyWatts() {
        return powerSupplyWatts;
    }

    public void setPowerSupplyWatts(int powerSupplyWatts) {
        this.powerSupplyWatts = powerSupplyWatts;
    }
}
