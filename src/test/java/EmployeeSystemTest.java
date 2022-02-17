import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSystemTest {

    EmployeeSystem testObject;
    Employee testEmployee;

    @Test
    public void checkIfEmployeeAddedToArrayListTest(){
        testObject = new EmployeeSystem();
        testEmployee = new Employee("Tobias", 26);
        testObject.addEmployeeToArrayList(testEmployee);
        boolean actual = testObject.employeeList.contains(testEmployee);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfEmployeeHasName(){
        testEmployee = new Employee("Tobias", 26);
        boolean actual = testEmployee.name.isEmpty();
        assertFalse(actual);
    }

    @Test
    public void checkIfEmployeeHasAge(){
        testEmployee = new Employee("Tobias",26);
        boolean actual;
        if(testEmployee.age > 0){
            actual = true;
        }
        else{
            actual = false;
        }
        assertTrue(actual);
    }

    @Test
    public void checkIfEmployeeHasID(){
        testEmployee = new Employee("Göran",53);
        System.out.println(testEmployee.uID);
        testEmployee = new Employee("Göran",53);
        testEmployee = new Employee("Göran",53);
        testEmployee = new Employee("Göran",53);
        System.out.println(testEmployee.uID);
        boolean actual = testEmployee.uID >= 0;
        assertTrue(actual);
    }




}

