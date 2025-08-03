
import Interthreadcommunication.Sharedresource;
import Interthreadcommunication.Consumer;
import Interthreadcommunication.Producer;
import Singletonclass.Singleton;
import ThreadPool.Executorclass;
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
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        s1.printdata();
        s2.printdata();

    }
}
