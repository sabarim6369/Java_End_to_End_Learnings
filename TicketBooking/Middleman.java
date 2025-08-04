package TicketBooking;

public class Middleman extends Thread{
    private String username;
    private Booking obj;
    public Middleman(Booking obj,String username){
        this.username=username;
        this.obj=obj;
    }
    public void run(){
        obj.bookticket(username);

    }
}
