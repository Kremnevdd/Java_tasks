public class Employee implements Comparable<Employee> {


   /* @Override
    public int compare(Employee e1, Employee e2) {
        return  (e2.getMonthSalary() - e1.getMonthSalary());
    }*/

    int getMonthSalary() {
        return 0;
    }

    @Override
    public int compareTo(Employee e) {
        return e.getMonthSalary() - this.getMonthSalary();
    }
}
