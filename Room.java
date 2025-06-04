public abstract class Room {
    private static int nextId = 1;  // Shared by all Room instances

    protected int id;
    protected String name;
    protected int capacity;

    public Room(String name, int capacity) {
        this.id = nextId++;
        this.name = name;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return "Room ID: " + id + ", Name: " + name + ", Capacity: " + capacity;
    }
}
