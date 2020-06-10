package factory;

public class RussianPCFactory implements PCfactory {
    @Override
    public int createCost() {
        return 500000;
    }

    @Override
    public String createCPU() {
        return "Байкал-3000";
    }

    @Override
    public String createMotherboard() {
        return "Rikor R-BD-E5D";
    }

    @Override
    public String createName() {
        return "Stalin-3000";
    }
}
