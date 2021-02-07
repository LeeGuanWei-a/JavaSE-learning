package test3;

//Collection中的方法
//多个List的交集，并集
//List是有序，可重复的容器
//有序：List每个元素都有索引标记。可以根据索引标记访问元素
//可重复：List允许加入重复的元素,通常允许满足a1.equals(a2)的元素重复加入
//Set是无序，不可重复的容器

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LList1 {
    public static void main(String[] args) {
        test01();

    }


    public static void test01(){
        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        List<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");

        System.out.println("list01" + list01);

        //添加另一个List中所有的元素
        //list01.addAll(list02);

        //移除与另一个List相同的元素
        //list01.removeAll(list02);

        //移除与另一个List不相同的元素
        list01.retainAll(list02);

        System.out.println("list01" + list01);

        System.out.println("list01是否包含list02中所有的元素=" + list01.containsAll(list02));

    }

}
