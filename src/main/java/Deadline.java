import java.util.Date;

public class Deadline extends Task {

    private final Date by;

    public Deadline(String description, Date by, boolean isDone) {
        super(description, TaskType.DEADLINE, isDone);
        this.by = by;
    }

    @Override
    public String getSavedString() {
        return super.getSavedString() + " | " + Ui.formatDate(by);
    }

    @Override
    public boolean isOccuringOn(Date date) {
        return date.equals(by);
    }

    @Override
    public String toString() {
        return super.toString() + " (by: " + Ui.formatDate(by) + ")";
    }
}
