import java.util.Date;

public class Event extends Task {

    private final Date at;

    public Event(String description, Date at, boolean isDone) {
        super(description, TaskType.EVENT, isDone);
        this.at = at;
    }

    @Override
    public String getSavedString() {
        return super.getSavedString() + " | " + Ui.formatDate(at);
    }

    @Override
    public boolean isOccuringOn(Date date) {
        return date.equals(at);
    }

    @Override
    public String toString() {
        return super.toString() + " (at: " + Ui.formatDate(at) + ")";
    }
    
}
