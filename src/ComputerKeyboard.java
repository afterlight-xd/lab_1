public class ComputerKeyboard extends CondimentDecorator {
    Computer computer;

    public  ComputerKeyboard(Computer computer){
        this.computer = computer;
    }
    public String getName(){
        return computer.getName() + " with keyboard";
    }
    public int getCost(){
        return 3500 + computer.getCost();
    }
}
