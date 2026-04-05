import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room added successfully!");
    }

    public void viewRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms available.");
            return;
        }

        for (Room r : rooms) {
            r.displayRoom();
        }
    }

    public void bookRoom(int roomNo, Customer customer) {
        for (Room r : rooms) {
            if (r.getRoomNumber() == roomNo) {
                if (!r.isBooked()) {
                    r.bookRoom(customer);
                    System.out.println("Room booked successfully!");
                } else {
                    System.out.println("Room already booked!");
                }
                return;
            }
        }
        System.out.println("Room not found!");
    }
}
