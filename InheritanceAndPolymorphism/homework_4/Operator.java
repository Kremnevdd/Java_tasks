public class Operator extends Employee {
    private int salary = 0;

    public Operator(int salary) {
        this.salary = salary;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }


}
