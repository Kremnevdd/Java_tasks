public class Main {
    public static void main(String[] args) {
        Company company = new Company(11231350);
        hireEmployees(company);
        System.out.println("------------------------");
        printHighestSalaries(company);
        System.out.println("--------------------");
        printLowestSalaries(company);
        fireHalfEmployees(company);
        printHighestSalaries(company);
        printLowestSalaries(company);
    }


    private static void fireHalfEmployees(Company company) {
        int countEmployees = company.countEmployees();
        for (int i = 0; i < countEmployees / 2; i++) {
            int index = (int) (Math.random() * company.countEmployees());
            Employee fired = company.getEmployees().get(index);
            company.fire(fired);
        }
        System.out.println("Уволено " + countEmployees / 2);
    }

    private static void hireEmployees(Company company) {
        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator(12346);
            company.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager(44556);
            company.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager();
            company.hire(topManager);
        }
        System.out.println("Добавлено сотрудников: " + company.countEmployees());
    }

    private static void printLowestSalaries(Company company) {
        System.out.println("Самые низкие : ");
        for (Employee employee : company.getLowestSalary(11)) {
            System.out.println(employee.getMonthSalary());
        }
    }

    private static void printHighestSalaries(Company company) {
        System.out.println("Самые высокие : ");
        for (Employee employee : company.getTopSalary(13)) {
            System.out.println(employee.getMonthSalary());
        }
    }
}
