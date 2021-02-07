package test3;

//Hash算法
//1.将key-value成对存放到HashMap的Entry[]数组中,首先调用key对象的hashcode()方法,获得hashcode
//2.根据hashcode计算出hash值（要求在[0,数组长度-1]之间）
//3.1  hash值 = hashcode/hashcode；即hash值总是1，键值对对象都会存储到数组索引1位置，相当于一个超长的链表，查询速率低
//3.2  hash值 = hashcode%数组长度；使得hash值均匀分布在[0,数组长度-1]之间,使用"除法",效率低下
//3.3  hash值 = hashcode & （数组长度 - 1）,数组长度必须是2的整数幂,采取位运算取余
//JDK1.8中，当链表长度大于8时，链表就转变为红黑数，提高查找的效率

public class HHash {
    public static void main(String[] args) {

        int h =25860399;    //hashcode哈希码，对象通过hashCode()方法获得
        int length = 16;    //length为2的整数次幂，则h&(length - 1)相当于对length取模
        System.out.println(myHash(h,length));
    }

    //求哈希值,对象存放的位置
    private static int myHash(int h, int length) {

        System.out.println(h&(length - 1));
        System.out.println(h%length);
        return h&(length - 1);
    }
}
