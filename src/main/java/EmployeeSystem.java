import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public void addEmployeeToArrayList(Employee newEmployee) {
        employeeList.add(newEmployee);
    }
    public void removeEmployeeFromArrayList(Employee newEmployee){
        employeeList.remove(newEmployee);
    }
}
