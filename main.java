
import Callable.work1;
import Interthreadcommunication.Sharedresource;
import Interthreadcommunication.Consumer;
import Interthreadcommunication.Producer;
import ParkingLot.Car;
import Singletonclass.Singleton;
import Singletonclass.Singleton2;
import ThreadPool.Executorclass;
import ThreadPool.Executorservice1;
import ThreadPool.Executorserviceclass;
import TicketBooking.Bookingmain;
import ParkingLot.Car;
public class main {
    public static void main(String[] args) {
//        Sharedresource s=new Sharedresource();
//        Producer p=new Producer(s);
//        Consumer c=new Consumer(s);
//        p.start();
//        c.start();
//        Executorclass.runtask();


        //singleton class->It is the one which is used to allow only one instance of class thrugh the applciation
      //  Singleton s1=new Singleton();    //cant create as Default constructor is private
//        Singleton s1=Singleton.getInstance();
//        Singleton s2=Singleton.getInstance();
//        s1.printdata();
//        s2.printdata();
//        Singleton2 s3=Singleton2.getInstance();
//        Singleton2 s4=Singleton2.getInstance();
//        Executorserviceclass.runtask();
//        Executorservice1 a=new Executorservice1();
//        a.executorservicemethod();
//        Bookingmain a=new Bookingmain();
//        a.bookticket();
//        Car carobj=new Car();
//        carobj.startfun();
        work1 w=new work1();
        try {
            w.fun();
        }
        catch (Exception e){}
        }

}
