import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public void addEmployeeToArrayList(Employee newEmployee) {
        employeeList.add(newEmployee);
    }
    public void removeEmployeeFromArrayList(Employee newEmployee){
        employeeList.remove(newEmployee);
    }

    public void raiseAllSalariesPercent(float percent) {
        for (int i = 0; employeeList.size() > i; ++i){
            employeeList.get(i).setSalary(employeeList.get(i).salary*(1+(percent/100)));
            System.out.println(employeeList.get(i).getSalary());
        }
    }

    public void raiseSingleEmployeeSalary(float percent, int uID) {

    }
}
