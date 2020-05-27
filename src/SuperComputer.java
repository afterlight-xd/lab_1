public class SuperComputer extends Computer{
    double tflops;

    @Override
    public int getCost() {
        return 12500000;
    }

    public double getTflops() {
        return tflops;
    }

    public void setPerformance(double tflops) {
        this.tflops = tflops;
    }

    public SuperComputer() {
    }
}
