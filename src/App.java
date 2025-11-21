import javax.swing.*;

public class App {
    public static void main(String[] args){
        EmployeeAddForm EmpAddForm = new EmployeeAddForm();
        JFrame frame = new JFrame("EmployeeFormTest");
        frame.setContentPane(EmpAddForm.GetEmployeeAddPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
