
public class Employee
{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double bypercent){
        double raise = salary * bypercent / 100;
        salary += raise;
    }
    private void getPrivate(){
        return;
    }
}
