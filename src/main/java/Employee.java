
public class Employee {
    String name;
    int age;
    float salary;
    static int uID = 0;
    static {
        uID += 1;
    }
    public Employee(String eName, int eAge, float eSalary){
        name = eName;
        age = eAge;
        salary = eSalary;
    }
    public String getName(){
        return name;
    }

}
