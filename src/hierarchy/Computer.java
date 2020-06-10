package hierarchy;

public abstract class Computer {
    private int cost=100000;
    private String name="Unknown Computer";

    public Computer() {
    }

    public abstract int getCost();

    public void setCost(int cost){this.cost=cost;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
 