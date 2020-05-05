public class Display extends ComputerPeriphery {
    private String ratio;
    private int diagonal;
    private int frequency;
    private String resolution;
    private String matrixType;

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Display(String name, int cost, String interfaceType, String manufacturer, String ratio, int diagonal, int frequency, String resolution, String matrixType) {
        super(name, cost, interfaceType, manufacturer);
        this.ratio = ratio;
        this.diagonal = diagonal;
        this.frequency = frequency;
        this.resolution = resolution;
        this.matrixType = matrixType;
    }
}
