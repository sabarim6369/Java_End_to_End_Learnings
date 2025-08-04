    package ParkingLot;

    import java.util.Scanner;
    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;

    public class Car {
        Parking obj=new Parking(100);
        ExecutorService service= Executors.newFixedThreadPool(50);
        Scanner sc = new Scanner(System.in);
        public void startfun() {
    while(true) {
        System.out.println("Choose an option:");
        System.out.println("1. Park Car");
        System.out.println("2. Leave Car");
        System.out.println("3. Check Available Slots");
        System.out.println("4. Show Parking Status");
        System.out.println("5. Exit");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose: Park Car");
                service.submit(()->{
                    int slots=obj.parkcar();
                    if(slots==-1){
                        System.out.println("Parking Full! Cannot park now.");
                        return;
                    }
                });

                break;
            case 2:
                System.out.println("You chose: Leave Car");
                System.out.print("Enter slot number to leave: ");
                int slot=sc.nextInt();
                service.submit(()->{
                    obj.leavecar(slot);
                });
                break;
            case 3:
                System.out.println("You chose: Check Available Slots");
                System.out.println("Available slots: " + obj.getAvailablelot());
                break;
            case 4:
                System.out.println("You chose: Show Parking Status");

                break;

            case 5:
                System.out.println("Exiting...");
                System.out.println("Exiting...");
                service.shutdown();
                sc.close();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

    }
        }
    }
