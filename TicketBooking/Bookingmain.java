package TicketBooking;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bookingmain {
  public Booking obj=new Booking();
  int i=0;
    public void bookticket(){
        ExecutorService exeservice=Executors.newFixedThreadPool(100);
        for(int i=0;i<100;i++){
           String name="User"+i;
//           Middleman middle=new Middleman(obj,name);
//           middle.start();
//           Thread t=new Thread(()->{
//               obj.bookticket(name);
//           });
//          Runnable task=()->{
//              obj.bookticket(name);
//          };
//          Thread t1=new Thread(task);
//          t1.start();
//           Executor ex= Executors.newSingleThreadExecutor();
//           ex.execute(()->{
//               obj.bookticket(name);
//           });
           exeservice.submit(()->{
               obj.bookticket(name);
           });



       }



    }
}
