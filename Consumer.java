public class Consumer extends Thread{
    private Sharedresource shared;
    Consumer(Sharedresource s){
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
