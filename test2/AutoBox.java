package test2;//自动装箱，自动拆箱
//缓存机制

import java.util.Arrays;

public class AutoBox {
    public static void main(String[] args) {
        //两种写法
        //数字转对象
        Integer a = 12;
        Integer a1 = Integer.valueOf(12);           //自动装箱

        //对象转数字
        int b =  a;
        int b1 = a.intValue();                      //自动拆箱

        Integer c = null;
        if (c != null){
            int c1 = c;
            //int c2 = c.intValue();
        }else {
            System.out.println("不能转化空对象 " );
        }

        //缓存[-128,127]之间的数字，实际是系统初始的时候，创建了[-128,127]之间的一个缓存数组
        //当创建Integer对象是，首先检查是否在[-128,127]之间，如果在这个范围内则直接从缓存数组中拿出已经创建好的对象
        //如果不在范围内，则创建新的Integer对象
        Integer i1 = Integer.valueOf(-128);
        Integer i2 = -128;
        System.out.println(i1 == i2);            //true,因为-128在缓存范围内，引用地址不同，JDK1.5版本后，视为同一对象
        System.out.println(i1.equals(i2));      //true

        System.out.println("################### " );
        Integer i3 = 1234;
        Integer i4 = 1234;
        System.out.println(i3 == i4);           //false，因为1234不在缓存范围内，且引用地址不同
        System.out.println(i3.equals(i4));      //true,对比对象的值



    }
}
