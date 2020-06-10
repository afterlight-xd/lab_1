import factory.*;
import decorator.*;
import hierarchy.*;
import iterator.*;


public class Main {

    public static int x = 5;

    public static void main(String[] args) {
        Computer myPC = new Server(96);
        myPC = new ComputerKeyboard(myPC);
        myPC = new ComputerMouse(myPC);

        System.out.println(myPC.getName() + " which costs " + myPC.getCost()+" rubles");
        /*Semaphore sem = new Semaphore(1,true);

        IncrementThread th1 = new IncrementThread(sem);
        DecrementThread th2 = new DecrementThread(sem);

        th1.start();
        th2.start();*/
        PCfactory factoryOne = new RussianPCFactory();
        PCfactory factoryTwo = new USAPCFactory();
        PersonalComputer PC1 = new StationaryPC(factoryOne);
        PersonalComputer PC2 = new PortablePC(factoryTwo);
        PC1.compile();
        PC2.compile();
        System.out.println(PC1.getName()+" "+PC1.getCost()+" "+PC1.getCPU()+" "+PC1.getMotherboard());
        System.out.println(PC2.getName()+" "+PC2.getCost()+" "+PC2.getCPU()+" "+PC2.getMotherboard()+"\n\n");

        FirstFloor firstFloor = new FirstFloor();
        SecondFloor secondFloor = new SecondFloor();
        ThirdFloor thirdFloor = new ThirdFloor();
        BuildingAdm adm = new BuildingAdm(firstFloor, secondFloor, thirdFloor);
        adm.printBuildingInfo();
    }
}
