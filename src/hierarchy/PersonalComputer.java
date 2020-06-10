package hierarchy;
import factory.*;

public abstract class PersonalComputer extends MicroComputer {
    private String motherboard;
    private PCfactory partsFactory;

    public PersonalComputer(PCfactory partsFactory) {
        super();
        this.partsFactory=partsFactory;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }
    public void compile(){
        setCost(partsFactory.createCost());
        setName(partsFactory.createName());
        setCPU(partsFactory.createCPU());
        setMotherboard(partsFactory.createMotherboard());
    }
}
