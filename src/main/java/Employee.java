
public class Employee {
    String name;
    int age;
    float salary;
    static int uID = 0;
    {
        uID += 1;
    }
    int uniqueID = uID;
    public Employee(String eName, int eAge, float eSalary){
        name = eName;
        age = eAge;
        salary = eSalary;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }


    public int getID(){
        return uniqueID;
    }
    public void setID(int newID){
        uniqueID = newID;
    }

    public float getSalary(){
        return salary;
    }
}
