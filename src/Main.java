import controllers.AppController;
import controllers.ClientController;
import controllers.EmployeeController;
import models.Client;
import models.Employee;
import views.ClientView;
import views.EmployeeView;

public class Main {

    private static Client model;
    private static EmployeeView view;
    private static ClientController clientController;
    private static Employee employeeModel;
    private static EmployeeController employeeController;
    private static AppController controller;

    public static void main(String[] args) {

        model = new Client();
        view = new EmployeeView(employeeModel);
        employeeController = new EmployeeController();
        controller = new AppController(clientController, employeeController);
        controller.subjectChoice();
    }
}
