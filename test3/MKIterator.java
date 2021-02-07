package test3;

//迭代器遍历List,Set,Map

import java.util.*;


public class MKIterator {
    public static void main(String[] args) {
        IteratorList();
        System.out.println("################ " );
        IteratorSet();
        System.out.println("################ " );
        IteratorMap();
    }

    //迭代器遍历List
    public static void IteratorList(){
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();){
            String temp = iterator.next();
            System.out.println(temp);

        }

    }


    //迭代器遍历Set
    public static void IteratorSet(){
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");

        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();){
            String temp = iterator.next();
            System.out.println(temp);

        }

    }

    //迭代器遍历Set
    public static void IteratorMap(){
        Map<Integer,String> map = new HashMap();
        map.put(1,"张三");
        map.put(3,"李四");
        map.put(2,"王五");

       //方法一
        Set<Map.Entry<Integer,String>> set = map.entrySet();

        for (Iterator<Map.Entry<Integer,String>> iterator = set.iterator(); iterator.hasNext();){
            Map.Entry<Integer,String> temp= iterator.next();

            System.out.println(temp.getKey() + "--" + temp.getValue());

        }

        System.out.println("################ " );

        //方法二
        Set<Integer> keySet = map.keySet();

        for (Iterator<Integer> iterator = keySet.iterator();iterator.hasNext();){
            Integer key = iterator.next();

            System.out.println(key + "--" + map.get(key));
        }

    }
}
