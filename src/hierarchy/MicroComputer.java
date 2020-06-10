package hierarchy;

public abstract class MicroComputer extends Computer {
    private String CPU;

    public MicroComputer() {

    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
}
