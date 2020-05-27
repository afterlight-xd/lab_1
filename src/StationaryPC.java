public class StationaryPC extends PersonalComputer {
    String powerSupply;
    int powerSupplyWatts;

    @Override
    public int getCost() {
        return 70000;
    }

    public StationaryPC() {
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
