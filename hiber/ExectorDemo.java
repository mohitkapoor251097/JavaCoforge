package hiber;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class thread implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("start 2");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end 2");
    }
}
public class ExectorDemo {
    public static void main(String[] args) {
        System.out.println("Current Thread"+Thread.currentThread().getName());
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable task1=()->
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println("start 1");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("end 1");
        };



        executorService.submit(task1);
        executorService.submit(new thread());





            ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
            Runnable task = () -> {
                System.out.println("Executing Task At " + System.nanoTime());
            };

            System.out.println("Submitting task at " + System.nanoTime() + " to be executed after 5 seconds.");
            scheduledExecutorService.schedule(task, 10, TimeUnit.SECONDS);

            scheduledExecutorService.shutdown();

    }
}
