package test3;

//HashSet的使用
//HashSet就是一个简易的HashMap

import java.util.HashSet;
import java.util.Set;

public class MKHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aa");                  //添加的是key
        set.add("bb");
        set.add("aa");
        System.out.println(set);        //元素不能重复

        set.remove("bb");
        System.out.println(set);

        Set<String> set1 = new HashSet<>();
        set1.add("张三");
        set.addAll(set1);
        System.out.println(set);
        System.out.println(set1);
    }
}
