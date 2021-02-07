package test2;//StringBuffer的使用,常用方法


import java.util.Arrays;

public class StringBuffer {
    public static void main(String[] args) {
        java.lang.StringBuffer sb = new java.lang.StringBuffer();

        for (int i = 0;i < 26; i ++){
            sb.append((char)('a'+i));   //在字符串后添加内容
            /*char temp = (char)('a'+i);
            sb.append(temp);*/
            System.out.println("sb = " + sb);
        }

        sb.reverse();                   //倒序
        System.out.println("sb = " + sb);

        sb.setCharAt(3,'高');    //给指定位置修改字符串的值
        System.out.println("sb = " + sb);

        sb.insert(0,'李');       //插入
        //链式调用，insert方法调用了return this,把自己返回了
        sb.insert(5,'观').insert(7,'伟');
        System.out.println("sb = " + sb);

        sb.delete(10,13);           //删除一个区间内的字符串内容
        System.out.println("sb = " + sb);



    }
}
