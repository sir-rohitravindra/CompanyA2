public class Developer extends Employee {

    public Developer() {
        System.out.println("Developer Employed!");
        this.designation = "Developer";
    }

    @Override
    public void handleIncomingTask(Task task) {
        switch (task.getTaskLevel()) {

            case 1: {

                ExecuteTask(task);
                return;
            }

            default:
                System.err.println("Incorrect task level for developer");
        }

    }

}
