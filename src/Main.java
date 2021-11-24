import controllers.AppController;
import controllers.ClientController;
import controllers.EmployeeController;
import models.Client;
import models.Employee;
import views.ClientView;
import views.EmployeeView;

public class Main {

    private static Client clientModel;
    private static EmployeeView employeeView;
    private static ClientView clientView;
    private static ClientController clientController;
    private static Employee employeeModel;
    private static EmployeeController employeeController;
    private static AppController controller;

    public static void main(String[] args) {

        employeeModel = new Employee();
        clientModel = new Client();
        clientView = new ClientView(clientModel);
        employeeView = new EmployeeView(employeeModel);
        clientController = new ClientController(clientView, clientModel);
        employeeController = new EmployeeController(employeeModel, employeeView);
        controller = new AppController(clientController, employeeController);
        controller.subjectChoice();
    }
}
