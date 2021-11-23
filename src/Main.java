import controllers.AppController;
import controllers.ClientController;
import controllers.EmployeeController;
import models.Client;
import views.ClientView;

public class Main {

    private static Client model;
    private static ClientView view;
    private static ClientController clientController;
    private static EmployeeController employeeController;
    private static AppController controller;

    public static void main(String[] args) {

        model = new Client();
        view = new ClientView(model, clientController);
        clientController = new ClientController(view, model);
        employeeController = new EmployeeController();
        controller = new AppController(clientController, employeeController);
        controller.subjectChoice();
    }
}
