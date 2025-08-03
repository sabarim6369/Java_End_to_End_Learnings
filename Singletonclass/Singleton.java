package Singletonclass;

public class Singleton {
    public static Singleton obj=new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return obj;
    }
    public void printdata(){
        System.out.println("Hello world");
        System.out.println(obj);
    }

}
