package com.bootcamp.collection;
import java.util.*;

class Employee implements Comparator<Employee>
{
    private double age;
    private double salary;
    private String name;

     Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
    Employee()
    {}


    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.salary < o2.salary) {
            return -1;
        }
        if (o1.salary > o2.salary) {
            return 1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}


public class Q4_HighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(24.00, 4330000, "Divanshu"));
        employeeList.add(new Employee(20.00, 4330000, "DH"));
        employeeList.add(new Employee(21.00, 430000, "Dinas"));
        employeeList.add(new Employee(22.00, 430000, "Max"));
        employeeList.add(new Employee(27.00, 330000, "Ell"));
        employeeList.add(new Employee(26.00, 30000, "Sean"));
        employeeList.add(new Employee(22.00, 40000, "Van"));
        employeeList.add(new Employee(25.00, 760000, "Dan"));


        Employee employee = new Employee();
        Collections.sort(employeeList, employee);

        for (Employee e : employeeList) {

            System.out.println(e.toString());
        }

    }
}
