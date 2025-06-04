public class Main {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        Room c1 = new Classroom("LX101", 30, "MTH10203");
        Room c2 = new Classroom("LX102", 25, "CSC122");
        Room l1 = new Lab("LXLab1", 20, "Computer");

        system.addRoom(c1);
        system.addRoom(c2);
        system.addRoom(l1);

        system.makeBooking(c1.getId(), "2025-06-10", "09:00", "10:00", "Alice");
        system.makeBooking(c1.getId(), "2025-06-10", "12:30", "13:30", "Bob");    // should not work
        system.makeBooking(l1.getId(), "2025-06-10", "10:00", "11:00", "Charlie");


        System.out.println("\nAll Bookings:");
        system.printBookings();

        System.out.println("\nAll Rooms:");
        system.printRooms();
    }
}
