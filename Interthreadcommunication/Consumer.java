package Interthreadcommunication;
public class Consumer extends Thread{
    private Sharedresource shared;
    public Consumer(Sharedresource s){
        shared=s;
    }
    public void run(){
        while(true){
            shared.consume();
            try{
                Thread.sleep(1000);
            }catch (Exception e){}

        }
    }
}
