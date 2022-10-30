class Public{
    private String name;
    public Public(){
        super();
        System.out.println("Inside Public less constructor");
    }
    public Public(String name){
        super();
        this.name = name;
    }
}
class Employee extends Public{
    private String companyName;
    public Employee(){
        // super();
        System.out.println("In Employee less Constructor");
    }
    public Employee(String name, String companyName){
        super(name);
        this.companyName = companyName;
    }
    @Override
    public String toString() {
        return "Employee Details : [Name: "+companyName;
    }
}
public class CheckConstructorCall {
    public static void main(String[] args) {
        Employee emp = new Employee("Omkar", "ABC");
    }
}
