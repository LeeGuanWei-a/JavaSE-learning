package test2;//StringBuider，StringBuffer的使用


import java.util.Arrays;

public class StringBuider {
    public static void main(String[] args) {
        //String对象定义后长度不可变
        String str = new String();

        //StringBuilder对象定义后长度可变,即可变的字符序列
        //StringBuilder线程不安全，效率高（一般都使用它）；StringBuffer线程安全，效率低
        StringBuilder sb = new StringBuilder("aaaabbbbcccc");
        java.lang.StringBuffer sb1 = new java.lang.StringBuffer();

        System.out.println("sb = " + Integer.toHexString(sb.hashCode()));
        System.out.println("sb = " +sb);

        //修改字符串内容
        sb.setCharAt(2,'M');
        System.out.println("sb = " + Integer.toHexString(sb.hashCode()));
        System.out.println("sb = " +sb);

    }
}
