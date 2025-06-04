import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private List<Room> rooms;
    private List<Booking> bookings;

    public BookingSystem() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public boolean makeBooking(int roomId, String date, String startTime, String endTime, String bookedBy) {
        Room roomToBook = null;

        for (Room r : rooms) {
            if (r.getId() == roomId) {
                roomToBook = r;
                break;
            }
        }

        if (roomToBook == null) {
            System.out.println("Room not found.");
            return false;
        }

        //new inputs
        int newStart = parseToMinutes(startTime);
        int newEnd = parseToMinutes(endTime);

        for (Booking b : bookings) {
            if (b.getRoom().getId() == roomId && b.getDate().equals(date)) {
                int existingStart = b.getStartMinutes();
                int existingEnd = b.getEndMinutes();

                //Existing:    (Start)09:00 to (End)10:00
                //New:        (Start)09:30 to (End)10:30 --> Overlaps

                boolean overlaps = newStart < existingEnd && existingStart < newEnd;
                if (overlaps) {
                    System.out.println("Room is already booked for this time slot.");
                    return false;
                }
            }
        }

        bookings.add(new Booking(roomToBook, date, startTime, endTime, bookedBy));
        System.out.println("Booking successful.");
        return true;
    }

    //covert to minutes
    private int parseToMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }


    public void printBookings() {
        for (Booking b : bookings) {
            System.out.println(b.getDetails());
        }
    }

    public void printRooms() {
        for (Room r : rooms) {
            System.out.println(r.getDetails());
        }
    }
}
