package hierarchy;

public class Server extends MicroComputer{
    private int RAM_TB;

    @Override
    public int getCost() {
        return 150000;
    }

    public int getRAM_TB() {
        return RAM_TB;
    }

    public void setRAM_TB(int RAM_TB) {
        this.RAM_TB = RAM_TB;
    }

    public Server(int RAM_TB) {
        this.RAM_TB = RAM_TB;
    }
}
