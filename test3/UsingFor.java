package test3;

//遍历集合的方法

import java.util.*;

public class UsingFor {
    public static void main(String[] args) {
        //遍历List
        List list = new ArrayList();
        //1.普通for循环
        for (int i = 0; i < list.size(); i++){
            String temp = (String)list.get(i);
            System.out.println(temp);
        }

        //2.增强for循环（在泛型使用时更方便）
        for (Object temp:list){
            System.out.println(temp);
        }

        //3.使用Iterator迭代器
        for (Iterator iterator = list.iterator(); iterator.hasNext();){
            String temp = (String)iterator.next();
            System.out.println(temp);
        }

        //4.使用Iterator迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            iterator.remove();          //如果要遍历时删除元素，建议使用这种方式
            System.out.println(object);
        }

        //遍历Set
        Set set = new HashSet();
        //1.增强for循环
        for (Object temp : set){
            System.out.println(temp);
        }

        //2.使用Iterator迭代器
        for (Iterator iterator1 = set.iterator(); iterator1.hasNext();){
            String temp = (String)iterator1.next();
            System.out.println(temp);
        }

        //遍历Map
        Map<Integer,Class> map = new HashMap<>();
        //1.根据key获取value
        Set<Integer> keySet = map.keySet();
        for (Integer id:keySet){
            System.out.println(map.get(id));
        }

        //2.使用entrySet
        Set<Map.Entry<Integer,Class>> set1 = map.entrySet();
        for (Iterator iterator1 = set1.iterator(); iterator1.hasNext();){
            Map.Entry entry = (Map.Entry)iterator1.next();
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }
}

