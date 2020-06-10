import java.util.concurrent.Semaphore;

public class IncrementThread  extends Thread{
    private Semaphore sem;
    public IncrementThread(Semaphore sem){
        this.sem=sem;
    }

    public void run()
    {
        try {
            for(int i = 0; i < 10; i++)
            {
                sem.acquire();
                if (Main.x<10) {
                    Main.x++;
                    System.out.println("Увеличение, x="+ Main.x);
                }
                else
                    System.out.println("Не увеличиваем, x="+ Main.x);
                sem.release();
            }
        } catch(InterruptedException e) {
            System.out.println ("Что-то пошло не так!");
        }
    }
}
