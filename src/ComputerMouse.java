public class ComputerMouse extends CondimentDecorator {
    Computer computer;

    public  ComputerMouse(Computer computer){
        this.computer=computer;
    }
    public String getName(){
        return computer.getName() + " with mouse";
    }
    public int getCost(){
        return 8000 + computer.getCost();
    }
}