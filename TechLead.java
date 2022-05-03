public class TechLead extends Employee {

    public TechLead() {
        System.out.println("Tech Lead Employed!");
        this.designation = "Tech Lead";
    }

    @Override
    public void handleIncomingTask(Task task) {
        switch (task.getTaskLevel()) {

            case 2: {
                ExecuteTask(task);
                return;
            }

            case 1: {
                OpenTask(task);
                this.subordinateEmployee.handleIncomingTask(task);
                return;
            }

            default:
                System.err.println("Incorrect task level for techLead");
        }

    }

}
