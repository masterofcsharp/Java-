import java.util.ArrayList;
import java.util.List;


public class ToDoList {
private List < String > tasks;

public ToDoList() {
tasks = new ArrayList<>();
}

public void add(String task) {
tasks.add(task);
}

public void print() {
for (int i = 0; i < tasks.size(); i++) {
System.out.println((i + 1) + ": " + tasks.get(i));
}
}

public void remove(int number) {
tasks.remove(number - 1);
}
}