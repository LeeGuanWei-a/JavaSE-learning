package test3;

//使用Map和List存储一张表

import java.util.*;

public class MapList {
    public static void main(String[] args) {
        Map<String,Object> row1 = new HashMap<>();
        row1.put("id",1001);
        row1.put("name","张三");
        row1.put("salary",50000);

        Map<String,Object> row2 = new HashMap<>();
        row2.put("id",1002);
        row2.put("name","李四");
        row2.put("salary",60000);

        Map<String,Object> row3 = new HashMap<>();
        row3.put("id",1003);
        row3.put("name","王五");
        row3.put("salary",70000);

        List<Map<String,Object>> table1 = new ArrayList<>();

        table1.add(row1);
        table1.add(row2);
        table1.add(row3);

        for (Map<String,Object> row : table1){
            Set<String> keySet = row.keySet();
            for (String key : keySet){
                System.out.print(key + ":" + row.get(key) + "\t");
            }
            System.out.println();


        }

    }
}
