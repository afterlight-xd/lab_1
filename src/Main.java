import java.util.concurrent.Semaphore;

public class Main {

    public static int x = 5;

    public static void main(String[] args) {
        Computer myPC = new PortablePC();
        myPC=new ComputerKeyboard(myPC);
        myPC=new ComputerMouse(myPC);

        System.out.println(myPC.getName() + " which costs " + myPC.getCost()+" rubles");
        Semaphore sem = new Semaphore(1,true);

        IncrementThread th1 = new IncrementThread(sem);
        DecrementThread th2 = new DecrementThread(sem);

        th1.start();
        th2.start();
    }
}
