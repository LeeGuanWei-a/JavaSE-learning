package test3;

//TreeMap的使用
//Comparable的使用
//HashMap:线程不安全，效率高；允许key或value为null
//HashTable：线程安全，效率低；不允许key或value为null


import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MKTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> treemap = new TreeMap<>();

        treemap.put(10,"aa");
        treemap.put(66,"bb");
        treemap.put(30,"cc");

        //按照key递增的方式自动排序
        for (Integer key:treemap.keySet()){
            System.out.println(key + "--- " + treemap.get(key));
        }


        Map<People,String> map = new TreeMap<>();
        map.put(new People(100,"李四",80000),"李四是个好人");
        map.put(new People(200,"张三",8000),"张三是个好人");
        map.put(new People(150,"王五",40000),"王五是个好人");
        map.put(new People(160,"赵六",40000),"赵六是个好人");

        //按照key递增的方式自动排序
        for (People key:map.keySet()){
            System.out.println(key + " --- " + map.get(key));
        }
    }
}

//自定义类实现排序
class People implements Comparable<People>{
    int id;
    String name;
    double salary;

    public People(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "id:"+id+"，name= "+name+"，salary= "+salary;
    }

    @Override
    public int compareTo(People o) {        //负数:小于；0：等于；正数：大于

        if (this.salary > o.salary){
            return 1;
        }else if (this.salary < o.salary){
            return -1;
        }else {
            if (this.id > o.id) {
                return 1;
            } else if (this.id < o.id) {
                return -1;
            }else {
                return 0;
            }
        }


    }
}