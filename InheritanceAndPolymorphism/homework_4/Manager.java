public class Manager extends Employee {
    private int salary = 0;

    public Manager(int salary) {
        this.salary = salary+ (int)(((Math.random() * 25000 + 1) + 115000) * 0.05);
    }



    @Override
    public int getMonthSalary() {
        return salary ;
    }


}
