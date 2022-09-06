package hiber;

public class ThreadDemo implements Runnable{
    public  void  run()
    {
        System.out.println("inside run mehod");
        for (int i=0;i<=4;i++)
        {
           System.out.println(Thread.currentThread().getName());
            Thread.currentThread().setName("t1");
            Thread.currentThread().setName("t2");
            System.out.println("inside run method value of  i is:" + i);
            System.out.println("thread is" + Thread.currentThread().getName());
            System.out.println("default priprio"+  Thread.currentThread().getPriority());
            Thread.currentThread().setPriority(1);
            System.out.println("after priority"+  Thread.currentThread().getPriority());
        }
    }
    public static void main(String [] args) throws InterruptedException {
        ThreadDemo th1=new ThreadDemo();
        ThreadDemo th2=new ThreadDemo();
        Thread  thread1=new Thread(th1);
        Thread thread2=new Thread(th2);
        System.out.println(Thread.currentThread().getName());
        thread1.start();
        Thread.sleep(5000);
        thread2.start();
    }
}


//public class ThreadDemo implements Runnable{
//    public  void  run()
//    {
//        System.out.println("inside run mehod");
//        for (int i=0;i<=4;i++)
//        {
//            System.out.println("thread is" + Thread.currentThread().getName());
//            Thread.currentThread().setName("t1");
//            Thread.currentThread().setName("t2");
//            System.out.println("inside run method value of  i is:" + i);
//            System.out.println("thread is" + Thread.currentThread().getName());
//        }
//    }
//    public static void main(String [] args)
//    {
//        ThreadDemo th1=new ThreadDemo();
//        ThreadDemo th2=new ThreadDemo();
//        Thread  thread1=new Thread(th1);
//        Thread thread2=new Thread(th2);
//        System.out.println("thread is" + Thread.currentThread().getName());
//        thread1.start();
//        thread2.start();
//    }
//}