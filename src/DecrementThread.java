import java.util.concurrent.Semaphore;

public class DecrementThread extends Thread{
    private Semaphore sem;
    public DecrementThread(Semaphore sem){
        this.sem=sem;
    }

    public void run()
    {
        try {
            for(int i = 0; i < 10; i++)
            {
                sem.acquire();
                if (Main.x>0) {
                    Main.x--;
                    System.out.println("Уменьшение, x="+Main.x);
                }
                else
                    System.out.println("Не уменьшаем, x="+Main.x);
                sem.release();
            }
        } catch(InterruptedException e) {
            System.out.println ("Что-то пошло не так!");
        }
    }
}