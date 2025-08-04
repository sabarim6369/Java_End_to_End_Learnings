package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executorservice1 {
    public void executorservicemethod(){
        ExecutorService a= Executors.newFixedThreadPool(100);
        for(int i=0;i<5;i++){
           Future<String> future= a.submit(()->{
               return "hi"+Thread.currentThread().getName();
            });
           try{
               String result=future.get();
               System.out.println(result);

           }catch(Exception e){}
        }

        a.shutdown();
    }


}
