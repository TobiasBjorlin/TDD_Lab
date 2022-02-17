import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    EmployeeSystem testObject;
    Employee tobias = new Employee();

    @Test
    public void checkIfEmployeeAddedToArrayListTest(){
        testObject = new EmployeeSystem();
        testObject.addEmployeeToArrayList(tobias);
        boolean actual = testObject.employeeList.contains(tobias);
        boolean expected = true;
        assertEquals(expected, actual);
    }


}

