public class Producer extends Thread{
    private Sharedresource shared;
    Producer(Sharedresource s){
        shared=s;
    }
    @Override
    public void run(){
        while(true) {

            shared.produce();
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}
