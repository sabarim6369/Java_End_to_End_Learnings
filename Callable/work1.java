package Callable;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class work1 {
    public void fun() throws Exception{
        ExecutorService service= Executors.newFixedThreadPool(100);
         work w=new work();
       Future<String>future=service.submit(w);
       String result=future.get();
       System.out.println(result);
       service.shutdown();
    }

}
