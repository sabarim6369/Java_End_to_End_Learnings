import tools.Calc;

public class main {
    public static void main(String[] args) {
        Sharedresource s=new Sharedresource();
        Producer p=new Producer(s);
        Consumer c=new Consumer(s);
        p.start();
        c.start();
    }
}
