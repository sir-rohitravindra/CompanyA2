public class EmployeeFactory {

    public EmployeeFactory() {
        System.out.println("Employee Factory is Up!");
    }

    public Employee employeeFactoryMethod(String designation) {
        switch (designation) {
            case "Manager":
                return new Manager();
            case "Tech Lead":
                return new TechLead();
            case "Developer":
                return new Developer();
            default:
                System.err.println("Incorrect Employee Type");
                return null;
        }

    }

}
