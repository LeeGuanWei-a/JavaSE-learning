package test3;


//Collections辅助类的使用

import java.util.*;

public class CCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add("li" + i);
        }
        System.out.println("list = " + list);

        Collections.shuffle(list);          //随机排列list中的元素
        System.out.println("list = " + list);

        Collections.reverse(list);          //逆序排列
        System.out.println("list = " + list);

        Collections.sort(list);             //按照递增排序，自定义的类使用Comparable接口
        System.out.println("list = " + list);

        System.out.println(Collections.binarySearch(list,"li02"));      //折半查找


    }
}
