package threaddemo;
class Thread1 extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread 1");
        }
    }
}
class Thread2 extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("thread 2");
        }
    }
}
public class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("helo");
        }
    }

    public static void main(String[] args) {
        ThreadDemo1 t1=new ThreadDemo1();
        Thread1 t2=new Thread1();
        Thread2 t3=new Thread2();
        t1.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}
