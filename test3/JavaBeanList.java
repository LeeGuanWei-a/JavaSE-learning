package test3;

//使用JavaBean和List存储一张表

import java.util.*;

public class JavaBeanList {
    public static void main(String[] args) {
        User user1 = new User(1001,"张三",50000);
        User user2 = new User(1002,"李四",60000);
        User user3 = new User(1003,"王五",70000);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        for (User u : list){
            System.out.println(u);

        }

        System.out.println("############################## " );

        Map<Integer,User> map = new HashMap<>();
        map.put(1001,user1);
        map.put(1002,user2);
        map.put(1003,user3);

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet){
            System.out.println(key + "--" + map.get(key));
        }


    }
}

class User{
    private int id;
    private String name;
    private double salary;

    public User(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return "id=" + id + ",name=" + name + ",salary=" + salary;
    }

}