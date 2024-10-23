package constructors;

// No Arg Constructors


public class Employee {
    int employee_number;
    String employee_name;
    Employee()
    {
        System.out.println("Employee object called from Constructor Class");
    }
    public static void main(String[] args){
        Employee employee = new Employee();

    }
}
