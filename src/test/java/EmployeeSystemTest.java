import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeSystemTest {

    EmployeeSystem testObject;
    Employee tobias;

    @Test
    public void checkIfEmployeeAddedToArrayListTest(){
        testObject = new EmployeeSystem();
        tobias = new Employee();
        testObject.addEmployeeToArrayList(tobias);
        boolean actual = testObject.employeeList.contains(tobias);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfEmployeeHasName(){
        tobias = new Employee();
        boolean actual = tobias.name.isEmpty();
    }


}

