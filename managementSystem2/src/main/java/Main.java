
import java.util.Scanner;
public class Main {
    


    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Room");
            System.out.println("2. View Rooms");
            System.out.println("3. Book Room");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();
                     hotel.addRoom(new Room(roomNo)); 
                    break;


                case 2:
                    hotel.viewRooms();
                    break;

                case 3:
                    System.out.print("Enter Room Number to Book: ");
                    int rNo = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    hotel.bookRoom(rNo, new Customer(name));
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

