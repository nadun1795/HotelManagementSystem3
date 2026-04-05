
public class Room {
    
    private int roomNumber;
    private boolean isBooked;
    private Customer customer;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom(Customer customer) {
        this.customer = customer;
        this.isBooked = true;
    }

    public void displayRoom() {
        System.out.print("Room No: " + roomNumber + " | ");
        if (isBooked) {
            System.out.println("Booked by: " + customer.getName());
        } else {
            System.out.println("Available");
        }
    }
}

