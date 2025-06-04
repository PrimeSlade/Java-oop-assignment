public class Booking {
    private Room room;
    private String date;
    private String startTime; // e.g., "09:00"
    private String endTime;   // e.g., "11:00"
    private String bookedBy;

    public Booking(Room room, String date, String startTime, String endTime, String bookedBy) {
        this.room = room;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.bookedBy = bookedBy;
    }

    public Room getRoom() {
        return room;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public int getStartMinutes() {
        String[] parts = startTime.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    public int getEndMinutes() {
        String[] parts = endTime.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    public String getDetails() {
        return "Booking: " + room.getName() + " on " + date +
                " from " + startTime + " to " + endTime + " by " + bookedBy;
    }
}
