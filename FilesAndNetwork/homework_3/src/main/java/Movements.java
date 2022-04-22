import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Movements {
    private final double USD_CONVERTATION = 68;
    private final double EURO_CONVERTATION = 120;
    private final String pathMovementsCsv;

    public Movements(String pathMovementsCsv) {
        this.pathMovementsCsv = pathMovementsCsv;
    }

    public Operation parseLineOfList(String line) {
        String info;
        boolean type;
        double expence = 0;
        double income = 0;
        String regex = "[\"]*(\\d+[,]?\\d*)[\"]?[,][\"]*(\\d+[,]*\\d*)[\"]*";
        Pattern pattern = Pattern.compile(regex);

        int firstSlashIndex = line.indexOf("/");
        if (firstSlashIndex < 0) {
            firstSlashIndex = line.indexOf("\\");
        }
        info = line.substring(firstSlashIndex + 1).trim();
        info = info.substring(0, info.indexOf("   "));
        String incomeAndExpense = line.substring(line.indexOf("  "));
        incomeAndExpense = incomeAndExpense.substring(incomeAndExpense.indexOf(",") + 1);
        Matcher matcher = pattern.matcher(incomeAndExpense);

        if (matcher.group(2).equals("0")) {// если рпсход равен нулю

            type = true;
            expence = 0.0;
            income = Double.parseDouble(matcher.group(1).replace(",", "."));
        } else {
            type = false;
            expence = Double.parseDouble(matcher.group(2).replace(",", "."));
            income = 0.0;
        }

        return new Operation(info, expence, income, type);
    }

    public double getExpenseSum() {
        double sum = 0;
        try {
            List<String> bankList = Files.readAllLines(Paths.get(pathMovementsCsv));
            for (int i = 1; i < bankList.size(); i++) {
                sum = sum + parseLineOfList(bankList.get(i)).getExpense();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }

    public double getIncomeSum() {
        double sum = 0;
        try {
            List<String> bankList = Files.readAllLines(Paths.get(pathMovementsCsv));
            for (int i = 1; i < bankList.size(); i++) {
                sum = sum + parseLineOfList(bankList.get(i)).getIncome();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }

    public Set<String> expenseByGroups() {
        Set<String> groupsList;
        List<String> outputList;
        Set<String> result = null;
        try {
            result = new TreeSet<>();
            List<String> bankList = Files.readAllLines(Paths.get(pathMovementsCsv));
            groupsList = new TreeSet<String>(bankList);
            List<String> list = new ArrayList<>(groupsList);
            outputList = new ArrayList<String>();
            for (int i = 1; i < groupsList.size() - 1; i++) {
                double sumByGroups = 0.0;
                for (int j = 1; j < list.size(); j++) {

                    if (parseLineOfList(list.get(i)).getInfomacion().equals(parseLineOfList(bankList.get(j)).getInfomacion())) {
                        sumByGroups = sumByGroups + parseLineOfList(bankList.get(j)).getExpense();
                    }
                    if (j == bankList.size() - 1) {
                        outputList.add(parseLineOfList(list.get(i)).getInfomacion() + "   -   " + sumByGroups + " руб.");
                    }
                }

            }
            result = new TreeSet<>(outputList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void byGroupsToString() {
        System.out.println("Суммы расходов по категориям :");
        for (int i = 0; i < expenseByGroups().size(); i++) {
            System.out.println(expenseByGroups().stream().toArray()[i]);
        }
    }
}
