public class TaskBuilder {

    private String taskName;
    private String taskType;
    private Status taskStatus;
    private int taskLevel;
    private int taskSize;
    private int effortRequired;

    public TaskBuilder() {
        System.out.println("Task Builder is Up!");
        cleanSlate();
    }

    public TaskBuilder setEffortRequired(int effortRequired) {
        this.effortRequired = effortRequired;
        return this;
    }

    public TaskBuilder setTaskLevel(int taskLevel) {
        this.taskLevel = taskLevel;
        return this;
    }

    public TaskBuilder setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    public TaskBuilder setTaskSize(int taskSize) {
        this.taskSize = taskSize;
        return this;
    }

    public TaskBuilder setTaskStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    public TaskBuilder setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    public Task buildTask() {

        Task newTask = new Task(taskName, taskType, taskStatus, taskLevel, taskSize, effortRequired);
        cleanSlate();
        return newTask;
    }

    public void cleanSlate() {
        taskName = "";
        taskType = "";
        taskStatus = Status.Pending;
        taskLevel = -1;
        taskSize = 1;
        effortRequired = 1;
    }
}
