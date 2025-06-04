public class Classroom extends Room {
    private String subject;

    public Classroom(String name, int capacity, String subject) {
        super(name, capacity);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getDetails() {
        return "Classroom (" + subject + ") -> " + super.getDetails();
    }
}
