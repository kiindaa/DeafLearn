public class Assignment {
    private String assignmentId;
    private String dueDate;
    private String description;

    public Assignment(String assignmentId, String dueDate, String description) {
        this.assignmentId = assignmentId;
        this.dueDate = dueDate;
        this.description = description;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Assignment ID: " + assignmentId + ",\nDue Date: " + dueDate + "\nDescription: " + description;
    }
}
