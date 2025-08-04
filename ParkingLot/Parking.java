package ParkingLot;

public class Parking {
    private  final boolean[] slots;
    private int availablelot;
   Parking(int slots){
       this.slots=new boolean[slots];
       this.availablelot=slots;
   }
   public synchronized int parkcar(){
       if(availablelot==0)return -1;
       for (int i = 0; i < slots.length; i++) {
           if (!slots[i]) {
               slots[i] = true;
               availablelot--;
               System.out.println("Car parked at slot " + i);
               return i;
           }
       }
       return -1; //
   }
   public synchronized void leavecar(int slot){
       if(slot>0 && slot<slots.length && slots[slot]){
           slots[slot]=false;
           availablelot++;
           System.out.println("Slot " + slot + " is now free.");
       }
       else {
           System.out.println("Invalid slot number or slot already free.");
       }

   }
   public synchronized int getAvailablelot(){
       return availablelot;
   }

}
