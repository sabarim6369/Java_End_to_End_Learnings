package TicketBooking;

public class Booking extends Thread{
    private int tickets=100;
    public   void bookticket(String username){
        if(tickets>0) {
            tickets--;
            System.out.println(username + "Booked a ticket successfully.Remaingin ticket left are" + tickets);
        }
        else{
            System.out.println(username + " failed to book a ticket. Sold out!");
        }
    }

}
