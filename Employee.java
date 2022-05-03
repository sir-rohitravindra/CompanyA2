public abstract class Employee {

    protected Employee subordinateEmployee;
    protected String designation;

    public void getDesignation() {
        System.out.println("I am a " + this.designation);
    }

    public void OpenTask(Task task) {
        task.setTaskStatus(Status.Opened);
        System.out.println(designation + " Opened the task " + task.getTaskName());
    }

    public void ExecuteTask(Task task) {
        task.setTaskStatus(Status.Executed);
        System.out.println(designation + " Executed the task " + task.getTaskName());
    }

    public void setNextChain(Employee employee) {

        this.subordinateEmployee = employee;

    }

    abstract public void handleIncomingTask(Task task);

}