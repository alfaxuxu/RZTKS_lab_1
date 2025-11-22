import java.sql.SQLException;
import java.util.List;

public class Controller {
    DataBase db = new DataBase();

    public Controller() {
        try{
            db.connect();
            db.getFromDataBase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee(Employee employee) {
        db.addEmployeeToDataBase(employee);
    }

    public List<Employee> getAllEmployees() {return db.getEmployees(); }
}
