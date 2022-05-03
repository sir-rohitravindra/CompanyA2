
import java.util.Scanner;

public class Company {

    private EmployeeFactory employeeFactory;
    private Employee headEmployee;

    private TaskBuilder taskBuilder;

    private Scanner input;

    public Company() {
        employeeFactory = new EmployeeFactory();
        headEmployee = employeeFactory.employeeFactoryMethod("Manager");

        Employee techLead = employeeFactory.employeeFactoryMethod("Tech Lead");
        Employee developer = employeeFactory.employeeFactoryMethod("Developer");

        headEmployee.setNextChain(techLead);
        techLead.setNextChain(developer);

        taskBuilder = new TaskBuilder();

        input = new Scanner(System.in);
    }

    public boolean createTask() {
        System.out.println("Enter Task Name: ");
        String name = input.nextLine();

        System.out.println("Enter task Level : ");
        int level = input.nextInt();

        Task curtask = taskBuilder.setTaskName(name).setTaskLevel(level).buildTask();
        handoutTask(curtask);

        System.out.println("Another task (y/n)");
        input.nextLine();
        if (input.nextLine().equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public void handoutTask(Task task) {
        this.headEmployee.handleIncomingTask(task);
    }

    public static void main(String[] args) {
        Company company = new Company();
        boolean looping = true;
        while (looping) {
            {

                looping = company.createTask();
            }
        }
    }

}
