package ThreadPool;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Executorclass {
    public static void runtask(){
        Executor executor= Executors.newSingleThreadExecutor();
        executor.execute(()->{
            System.out.println("Executor task is running"+Thread.currentThread().getName());
        });
        System.out.println("Main thread"+Thread.currentThread().getName());
    }
}
