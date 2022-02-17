import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    Employee testObject;

    @Test
    public void checkIfEmployeeAddedToArrayListTest(){
        testObject = new Employee();
        Employee.addEmployeeToArrayList(testObject);
        boolean actual = employeeList.contains(testObject);
        boolean expected = true;
        assertEquals(expected, actual);
    }


}

