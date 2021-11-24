import controllers.AppController;
import controllers.ClientController;
import controllers.EmployeeController;
import models.Client;
import models.Employee;
import views.EmployeeView;

public class Main {

    private static Client clientModel;
    private static EmployeeView employeeView;
    private static ClientController clientController;
    private static Employee employeeModel;
    private static EmployeeController employeeController;
    private static AppController controller;

    public static void main(String[] args) {

        employeeModel = new Employee();
        clientModel = new Client();
        employeeView = new EmployeeView(employeeModel);
        employeeController = new EmployeeController(employeeModel, employeeView);
        controller = new AppController(clientController, employeeController);
        controller.subjectChoice();
    }
}
