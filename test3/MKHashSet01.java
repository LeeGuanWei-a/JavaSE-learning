package test3;

//自定义实现HashSet

import java.util.Arrays;
import java.util.HashMap;

public class MKHashSet01 {
    HashMap map;

    private static final Object PERSENT =new Object();

    public MKHashSet01() {
        map = new HashMap();
    }

    public void add(Object obj){
        map.put(obj,PERSENT);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (Object key:map.keySet()){
            sb.append(key + ",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();

    }

    public static void main(String[] args) {
        MKHashSet01 set = new MKHashSet01();
        set.add("aa");
        set.add("bb");
        set.add("cc");

        System.out.println("set = " + set);

    }

}
