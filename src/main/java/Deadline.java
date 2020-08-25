import java.text.SimpleDateFormat;
import java.util.Date;

public class Deadline extends Task {

    private final Date by;

    public Deadline(String description, Date by) {
        super(description, TaskType.DEADLINE);
        this.by = by;
    }

    @Override
    public boolean isOccuringOn(Date date) {
        return date.equals(by);
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + (new SimpleDateFormat("MMM d yyyy")).format(by) + ")";
    }
}
