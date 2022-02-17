import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmployeeSystemTest {

    EmployeeSystem testObject;
    Employee tobias;

    @Test
    public void checkIfEmployeeAddedToArrayListTest(){
        testObject = new EmployeeSystem();
        tobias = new Employee("Tobias");
        testObject.addEmployeeToArrayList(tobias);
        boolean actual = testObject.employeeList.contains(tobias);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfEmployeeHasName(){
        tobias = new Employee("Tobias");
        boolean actual = tobias.name.isEmpty();
        assertFalse(actual);
    }


}

