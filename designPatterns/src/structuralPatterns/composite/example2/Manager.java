package structuralPatterns.composite.example2;
import com.sun.java.accessibility.util.EventQueueMonitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee2 {
    private List<Employee2> employee2List = new ArrayList<Employee2>();
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void showEmployeeDetails() {
       System.out.println("-----------");
       System.out.println("Name ="+getName());
       System.out.println("Salary ="+getSalary());
       System.out.println("-----------");

        Iterator<Employee2> employee2Iterator = employee2List.iterator();
        while (employee2Iterator.hasNext()) {
            Employee2 employee2 = employee2Iterator.next();
            employee2.showEmployeeDetails();
        }
    }

    public Employee2 getChild(int i) {
        return employee2List.get(i);
    }

    public void addEmployee(Employee2 emp) {
        employee2List.add(emp);
    }

    public void removeEmployee(Employee2 emp) {
        employee2List.remove(emp);
    }

}
