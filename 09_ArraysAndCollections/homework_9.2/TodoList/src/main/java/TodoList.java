import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
        System.out.println("Добавлено дело " + todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (todoList.size() <= index) {
            todoList.add(todo);
            System.out.println("Дело " + " добавлено в конец списка");
            return;
        } else {
            todoList.add(index, todo);
            System.out.println("Добавлено дело " + todo);
        }
    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (todoList.size() <= index) {
            System.out.println("Дела с таким индексом не существует");
            return;
        } else {
            String temp = todoList.get(index);
            todoList.remove(index);
            todoList.add(index, todo);
            System.out.println("Дело " + temp + " с индексом " + index + " заменено на " + todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index >= todoList.size()) {
            System.out.println("Невозможно удалить несуществующее дело");
            return;
        }
        String temp = todoList.get(index);
        todoList.remove(index);
        System.out.println("Дело " + temp + " с индексом " + index + " - " + "удалено");
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todoList;
    }


}