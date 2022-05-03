public class Manager extends Employee {

    public Manager() {
        System.out.println("Manager Employed!");
        this.designation = "Manager";
    }

    @Override
    public void handleIncomingTask(Task task) {

        switch (task.getTaskLevel()) {
            case 3: {

                OpenTask(task);
                ExecuteTask(task);
                return;
            }

            case 2: {
                OpenTask(task);
                this.subordinateEmployee.handleIncomingTask(task);
                return;
            }

            case 1: {
                this.subordinateEmployee.handleIncomingTask(task);
                return;
            }

            default:
                System.err.println("Incorrect task level for manager");
        }

    }

}
