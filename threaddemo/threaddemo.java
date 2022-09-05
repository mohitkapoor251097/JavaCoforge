package threaddemo;
class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=10;i++)
        System.out.println("First thread"+ i);
    }
}
class MyThread2 implements  Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<=10;i++) {

            try {
                Thread.sleep(5000);
            } catch (Exception e) {

            }
            System.out.println("second thread" + i);
        }
    }
}
public class threaddemo {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        MyThread2 t2=new MyThread2();
        Thread t=new Thread(t2);
        t.start();
    }
}
