package hierarchy;

public class Mainframe extends Computer {
    private double mips;

    @Override
    public int getCost() {
        return 500000;
    }

    public Mainframe(){
    }
}
