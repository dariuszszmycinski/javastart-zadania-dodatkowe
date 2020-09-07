public class PaymentCalculator {
    public int nettoYearPayment(Employee employee) {
        return employee.getSalaryMonthly() * 12;
    }

    public int bruttoYearPayment(Employee employee) {
        return ((int) (employee.getSalaryMonthly() * 1.2) + 1000) * 12;
    }
}
