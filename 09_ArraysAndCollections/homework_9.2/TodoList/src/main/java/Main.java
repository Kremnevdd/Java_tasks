import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final TodoList todoList = new TodoList();

    public static void main(String[] args) {

        // TODO: написать консольное приложение для работы со списком дел todoList
        boolean stop = false;
        while (!stop) {
            Scanner s = new Scanner(System.in);
            String entry = s.nextLine();
            String regex = "([\\S]+) (\\d+) (.*)";
            String regexForDelete = "([\\S]+) (\\d+)";
            Pattern patternForDelete = Pattern.compile(regexForDelete);
            Matcher matcherForDelete = patternForDelete.matcher(entry);
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(entry);
            String[] data = entry.split(" " );
            switch (data[0]) {
                case "ADD":
                    if (matcher.find()) {
                        todoList.add(Integer.parseInt(matcher.group(2)), matcher.group(3));
                    } else {
                        int stringAfterFirstSpaceIndex = entry.indexOf(" ") + 1;
                        todoList.add(entry.substring(stringAfterFirstSpaceIndex));
                    }

                    break;
                case "LIST":

                    if (todoList.getTodos().size() > 0) {
                        System.out.println("Список дел:");
                        for (int i = 0; i < todoList.getTodos().size(); i++) {
                            System.out.println(i + " - " + todoList.getTodos().get(i));
                        }
                    } else {
                        System.out.println("Список дел пуст....");
                    }
                    break;
                case "EDIT":
                    if (matcher.find()) {
                        todoList.edit(matcher.group(3), Integer.parseInt(matcher.group(2)));
                    } else {
                        System.out.println("Не указан номер ");
                    }
                    break;
                case "DELETE":
                    if (matcherForDelete.find()) {
                        todoList.delete(Integer.parseInt(matcherForDelete.group(2)));
                    }
                    break;
                case "STOP":
                    stop = true;
                    System.out.println("Спасибо за использоване списка дел!");
                    break;
            }
        }
    }
}
