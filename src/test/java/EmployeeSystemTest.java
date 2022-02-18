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
        Employee newonetestEmployee = new Employee("Göran",53, 1000);
        Employee newtwotestEmployee = new Employee("Göran",53, 1000);
        Employee newthreetestEmployee = new Employee("Göran",53, 1000);
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
        testEmployee = new Employee("Andreas", 26 , 2000);
        System.out.println(testEmployee.getName());
        testEmployee.setName("Andenman");
        System.out.println(testEmployee.getName());
        boolean actual = testEmployee.getName().equals("Andenman");

        assertTrue(actual);
    }

    @Test
    public void testGetAndSetForAge(){
        testEmployee = new Employee("Linus", 26,100 );
        System.out.println(testEmployee.getAge());
        testEmployee.setAge(6);
        System.out.println(testEmployee.getAge());
        boolean actual = testEmployee.getAge() == 6;

        assertTrue(actual);
    }

    @Test
    public void testGetAndSetForID(){
        testEmployee = new Employee("Simon", 25, 71000);
        Employee newtestEmployee = new Employee("Simon", 25, 71000);
        System.out.println(testEmployee.getID());
        testEmployee.setID(5);
        System.out.println(testEmployee.getID());
        Employee newonetestEmployee = new Employee("Simon", 25, 34000);
        System.out.println(testEmployee.getID());
        System.out.println(newtestEmployee.getID());
        System.out.println(newonetestEmployee.getID());

        boolean actual = testEmployee.getID() == 5;
        assertTrue(actual);
    }

    @Test
    public void testGetAndSetForSalary(){
        testEmployee = new Employee("Samuel", 25, 40000);
        System.out.println(testEmployee.getSalary());

    }

}

