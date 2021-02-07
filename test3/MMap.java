package test3;

//Map的使用,键值对
//键不能重复

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MMap {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();      //Map<k,v> k,v任意类型

        map.put(1,"aa");
        map.put(2,"bb");
        map.put(3,"cc");

        System.out.println("1 = " + map.get(1));

        System.out.println("size = " + map.size());

        System.out.println("是否包含键 =" + map.containsKey(1));

        System.out.println("是否包含值 =" + map.containsValue("dd"));

        Map<Integer,String> map1 = new HashMap<>();

        map1.put(3,"dd");
        map1.put(4,"ee");
        map1.put(5,"ff");

        //map中键不能重复，如果重复（是否重复是根据equals方法来判断），则新的value覆盖旧的value
        map.putAll(map1);
        System.out.println("map = " + map);

    }
}
