/**
 * Created by lehar.j on 7/17/2017.
 */
public interface Employee {
    public String getName();
    public double getSalary();
    public void print();
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);
}
