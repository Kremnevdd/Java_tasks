import java.util.Collections;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.


        Collections.sort(staff, (o1, o2) -> {
            if (o1.getSalary() - o2.getSalary() == 0) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getSalary() - o2.getSalary();
            }
        });
    }

}
