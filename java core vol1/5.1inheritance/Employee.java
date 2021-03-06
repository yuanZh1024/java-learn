import com.sun.tools.internal.ws.processor.model.ExtendedModelVisitor;
import javafx.beans.binding.ObjectExpression;

import java.util.Objects;

public class Employee implements Comparable<Employee>
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
    @Override public boolean equals(Object other) {
        if(this == other) return true;
        if(other == null) return false;
        if(getClass() != other.getClass()) { //返回对象所属的类
            return false;
        }

        Employee em = (Employee)other;

        return name.equals(em.name)
                && salary == em.salary;
        //为了防止name为Null
        //return Objects.equals(name, em.name);
        //如果两个参数都不为null 则调用 a.equals(b)

        //if(!(other instanceof Employee)) return false;
        //如果调用employee.equals(manager)
    }
    /*@Override public boolean equals(Employee other){
        //错误: 方法不会覆盖或实现超类型的方法
    }*/

    public int compareTo(Employee other)
    {
        return Double.compare(salary, other.salary);
    }
}
