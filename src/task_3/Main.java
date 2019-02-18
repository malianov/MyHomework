package task_3;

import task_3.controller.Controller;
import task_3.model.Model;
import task_3.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUserInput();
    }
}
