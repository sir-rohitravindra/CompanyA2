public class Task {

    private String taskName;
    private String taskType;
    private Status taskStatus;
    private int taskLevel;
    private int taskSize;
    private int effortRequired;

    public Task(String taskName, String taskType, Status taskStatus, int taskLevel, int taskSize, int effortRequired) {
        this.taskLevel = taskLevel;
        this.taskName = taskName;
        this.taskSize = taskSize;
        this.effortRequired = effortRequired;
        this.taskType = taskType;
        this.taskStatus = taskStatus;
    }

    public int getEffortRequired() {
        return effortRequired;
    }

    public int getTaskLevel() {
        return taskLevel;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskSize() {
        return taskSize;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    public String getTaskType() {
        return taskType;
    }

    // public void setEffortRequired(int effortRequired) {
    // this.effortRequired = effortRequired;
    // }

    // public void setTaskLevel(int taskLevel) {
    // this.taskLevel = taskLevel;
    // }

    // public void setTaskName(String taskName) {
    // this.taskName = taskName;
    // }

    // public void setTaskSize(int taskSize) {
    // this.taskSize = taskSize;
    // }

    public void setTaskStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
    }

}
