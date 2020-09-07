public class Employee {
    private final String firstName;
    private final String lastName;
    private final int salaryMonthly;

    public Employee(String firstName, String lastName, int salaryMonthly) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryMonthly = salaryMonthly;
    }

    public int getSalaryMonthly() {
        return salaryMonthly;
    }
}
