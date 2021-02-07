package test3;

//Map的常用方法

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MMap2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(001,"张三",50000);
        Employee e2 = new Employee(002,"李四",60000);
        Employee e3 = new Employee(003,"王五",70000);
        Employee e4 = new Employee(001,"李观伟",50000);

        Map<Integer,Employee> map =new HashMap<>();

        map.put(001,e1);
        map.put(002,e2);
        map.put(003,e3);
        map.put(001,e4);

        Employee emp = map.get(001);
        System.out.println("Employee = " + emp.getEname());

        System.out.println("map =" + map);
    }
}



class Employee{
    private int id;
    private String ename;
    private double salary;

    @Override
    public String toString() {
        return ":id = " + id + ",姓名 = " + ename + ",薪水 = " + salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String ename, double salary) {
        this.id = id;
        this.ename = ename;
        this.salary = salary;
    }
}