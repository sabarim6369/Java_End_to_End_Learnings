package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorserviceclass {
public static void runtask(){
    ExecutorService a= Executors.newFixedThreadPool(10);
    for(int i=0;i<5;i++){
        int taskId=i;
        a.submit(()->{
            System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
        });
    }
    System.out.println("Main thread: " + Thread.currentThread().getName());

    a.shutdown();
}
}
