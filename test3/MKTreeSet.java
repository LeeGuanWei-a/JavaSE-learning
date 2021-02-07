package test3;

//TreeSet的使用

import java.util.Set;
import java.util.TreeSet;

public class MKTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(300);
        set.add(400);
        set.add(100);

        for (Integer m:set){
            System.out.println("set = " + m);
        }

        Set<People2> set1 = new TreeSet<>();
        set1.add(new People2(100,"张三",5000));
        set1.add(new People2(50,"李四",4000));
        set1.add(new People2(150,"王五",80000));

        for (People2 m:set1){
            System.out.println("set1 = " + m);
        }

    }

}

//自定义类实现排序
class People2 implements Comparable<People2> {
    int id;
    String name;
    double salary;

    public People2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "id: " + id + "，name = " + name + "，salary = " + salary;
    }

    @Override
    public int compareTo(People2 o) {        //负数:小于；0：等于；正数：大于

        if (this.salary > o.salary) {
            return 1;
        } else if (this.salary < o.salary) {
            return -1;
        } else {
            if (this.id > o.id) {
                return 1;
            } else if (this.id < o.id) {
                return -1;
            } else {
                return 0;
            }
        }


    }
}