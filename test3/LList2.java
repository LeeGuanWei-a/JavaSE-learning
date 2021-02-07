package test3;

//List的索引的使用

import java.util.ArrayList;
import java.util.List;

public class LList2 {
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        List<String> list = new ArrayList<>();

        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");

        System.out.println(list);

        //根据索引位置插入元素
        list.add(2,"李四");
        System.out.println(list);

        //根据索引位置删除元素
        list.remove(2);
        System.out.println(list);

        //根据索引位置设置元素
        list.set(2,"张三");
        System.out.println(list);

        //获取索引位置的元素
        System.out.println(list.get(2));

        list.add("cc");
        list.add("dd");
        list.add("bb");
        System.out.println("list = " + list);

        //获取指定值第一次出现的索引
        System.out.println(list.indexOf("bb"));
        System.out.println(list.indexOf("a"));

        //获取指定值最后一次出现的索引
        System.out.println(list.lastIndexOf("bb"));
    }

}
