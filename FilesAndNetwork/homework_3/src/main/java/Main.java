import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Movements m = new Movements("C:/movementList.csv");
        System.out.println("Общая сумма расхода :");
        System.out.println(m.getExpenseSum() + " руб.");
        System.out.println("Общая сумма прихода :");
        System.out.println(m.getIncomeSum() + " руб.");
        m.byGroupsToString();
    }
}