package test3;

//Collection接口中的方法
//List和Set中的方法类似

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class LList {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();

        System.out.println("容器大小 = " + c.size());
        System.out.println("容器是否为空 = " + c.isEmpty());

        //添加元素,存储元素的地址
        c.add("11");
        c.add("22");
        c.add("33");
        System.out.println(c);
        System.out.println("容器大小 = " + c.size());

        //将容器转化成Object数组
        Object[] objects =  c.toArray();
        System.out.println(objects);

        //容器是否包含某个元素
        System.out.println("是否包含" + c.contains("11"));


        //移除元素，不是删除元素.元素还存在，值移除元素的地址
        c.remove("33");
        System.out.println(c);

        //移除容器中的所有元素
        c.clear();
        System.out.println(c);


    }
}


