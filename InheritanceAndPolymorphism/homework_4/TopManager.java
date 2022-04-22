public class TopManager extends Employee {
   private int salary = 0;
    private final int FIXED_SALARY = 70000;
    public TopManager(){
        if (Company.getIncome() > 10000000) {
            this.salary = (int) (FIXED_SALARY * 1.5);
        } else {
           this.salary = FIXED_SALARY;
        }
    }


    @Override
    public int getMonthSalary() {
        return salary;
    }


}
