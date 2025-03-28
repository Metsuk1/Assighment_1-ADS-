import tasks.Tasks_type;


public class Main {
    public static void main(String[] args) {
        Tasks_type tasks_type = new Tasks_type();
        MyApplication app = new MyApplication(tasks_type);

        app.mainMenu();
    }
}
