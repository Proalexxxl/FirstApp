import controllers.AppController;
import controllers.ClientController;
import controllers.EmployeeController;
import models.Client;
import views.ClientView;

public class Main {

    private static Client clientModel;
    private static ClientView view;
    private static ClientController clientController;
    private static EmployeeController employeeController;
    private static AppController controller;

    public static void main(String[] args) {

        clientModel = new Client();
        view = new ClientView(clientModel, clientController);
        clientController = new ClientController(view, clientModel);
        employeeController = new EmployeeController();
        controller = new AppController(clientController, employeeController);
        controller.subjectChoice();
    }
}
