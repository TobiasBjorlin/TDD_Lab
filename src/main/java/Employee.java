
public class Employee {
    String name;
    int age;
    static int uID = 0;
    {
        uID += 1;
    }
    public Employee(String eName, int eAge){
        name = eName;
        age = eAge;

    }

}
