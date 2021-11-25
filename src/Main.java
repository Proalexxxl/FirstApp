/**
 * @autor Timofeenko Alekseii
 * version 1.0.0
 */

import controllers.AppController;
import controllers.ClientController;
import controllers.EmployeeController;
import models.Client;
import models.Employee;
import views.ClientView;
import views.EmployeeView;

public class Main {

    public static void main(String[] args) {

        Employee employeeModel = new Employee();
        Client clientModel = new Client();
        ClientView clientView = new ClientView(clientModel);
        EmployeeView employeeView = new EmployeeView(employeeModel);
        ClientController clientController = new ClientController(clientView, clientModel);
        EmployeeController employeeController = new EmployeeController(employeeModel, employeeView);
        AppController controller = new AppController(clientController, employeeController);

        controller.subjectChoice();
    }
}
