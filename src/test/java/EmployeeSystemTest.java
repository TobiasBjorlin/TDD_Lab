import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeSystemTest {

    EmployeeSystem testObject;
    Employee testEmployee;

    @Test
    public void checkIfEmployeeAddedToArrayListTest(){
        testObject = new EmployeeSystem();
        testEmployee = new Employee("Tobias", 26, 1000);
        testObject.addEmployeeToArrayList(testEmployee);
        boolean actual = testObject.employeeList.contains(testEmployee);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfEmployeeHasName(){
        testEmployee = new Employee("Tobias", 26, 10000);
        boolean actual = testEmployee.name.isEmpty();
        assertFalse(actual);
    }

    @Test
    public void checkIfEmployeeHasAge(){
        testEmployee = new Employee("Tobias",26, 1000);
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
        testEmployee = new Employee("Göran",53, 1000);
        System.out.println(testEmployee.uID);
        testEmployee = new Employee("Göran",53, 1000);
        testEmployee = new Employee("Göran",53, 1000);
        testEmployee = new Employee("Göran",53, 1000);
        System.out.println(testEmployee.uID);
        boolean actual = testEmployee.uID >= 0;
        assertTrue(actual);
    }


    @Test
    public void checkIfEmployeeHasSalary(){
        testEmployee = new Employee("Viktor", 26, 1000);
        boolean actual = false;
        if (testEmployee.salary > 0){
            actual = true;
        }
        assertTrue(actual);
    }

    @Test
    public void testGetAndSetForName(){
        testEmployee.getName();
    }

}

