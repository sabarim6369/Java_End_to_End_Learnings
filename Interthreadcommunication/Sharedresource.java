package Interthreadcommunication;

public class Sharedresource {
    private int data;
    private boolean havedata=false;
    public Sharedresource() {
        this.data = 0;
    }
    public synchronized void produce(){
        while(havedata){
            try{
                wait();
            }catch(Exception e){}
        }
        data++;
        System.out.println("Produced"+data);
        havedata = true;
        notify();
    }
    public synchronized void consume(){
        while(!havedata){
            try{
                wait();
            }
            catch (Exception e){}
        }
        System.out.println("Consumed"+data);
        havedata=false;
        notify();
//        data--;
    }
}
