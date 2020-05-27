public abstract class Computer {
    int cost=100000;
    String name="Unknown Computer";

    public Computer() {
    }

    public abstract int getCost();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
