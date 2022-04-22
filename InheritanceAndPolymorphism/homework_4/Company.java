import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company {
    public static double income;

    public Company(double income) {
        this.income = income;
    }
    private final List<Employee> employeesList = new ArrayList<Employee>();

    public void hire(Employee employee) {
        employeesList.add(employee);

    }

    public void hireAll(Collection<Employee> employees) {
        this.employeesList.addAll(employeesList);


    }

    public void fire(Employee employee) {
        employeesList.remove(employee);
    }

    public static double getIncome() {
        return income;
    }

    public List<Employee> getEmployees() {
        return employeesList;
    }

    public int countEmployees() {
        return employeesList.size();
    }

    public List<Employee> getLowestSalary(int count){
        List<Employee> lowList = new ArrayList<Employee>(employeesList);
        Collections.reverseOrder();
        List<Employee> lowResult = new ArrayList<Employee>();
        for (int i = 0; i<count; i++){
            lowResult.add(lowList.get(i));
        }

        return lowResult;
    }

    public List<Employee> getTopSalary(int count) {
        List<Employee> topList = new ArrayList<Employee>(employeesList);
        Collections.sort(topList);
        List<Employee> topResult = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            topResult.add(topList.get(i));
        }
        return topResult;
    }
    /*public List<Employee> getTopSalary(int count){

    }*/

}



