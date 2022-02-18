
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
        return uID;
    }
    public void setID(int newID){
        uID = newID;
    }


}
