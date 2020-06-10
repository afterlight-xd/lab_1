package factory;

public class USAPCFactory implements PCfactory{
    @Override
    public int createCost() {
        return 100000;
    }

    @Override
    public String createCPU() {
        return "Intel i7-9700K";
    }

    @Override
    public String createMotherboard() {
        return "GIGABYTE Z390";
    }

    @Override
    public String createName() {
        return "Secret Pentagon PC";
    }
}
