public class Lab extends Room {
    private String labType;

    public Lab(String name, int capacity, String labType) {
        super(name, capacity);
        this.labType = labType;
    }

    public String getLabType() {
        return labType;
    }

    @Override
    public String getDetails() {
        return "Lab (" + labType + ") -> " + super.getDetails();
    }
}
