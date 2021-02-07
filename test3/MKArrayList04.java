package test3;

//自定义实现一个ArrayList
//添加泛型
//添加数组扩容
//添加set()和get()方法
//添加数组边界的检查

import java.util.ArrayList;

public class MKArrayList04<E> {

    private Object[] elementData;       //存储内容
    private int size;                   //数组大小
    private static final int DEFAULT_CAPACITY = 10;     //设置默认数组长度

    public MKArrayList04(){
        elementData = new Object[DEFAULT_CAPACITY];    //设置默认数组长度

    }

    public MKArrayList04(int capacity){

        if (capacity < 0){
            throw new RuntimeException("容器的容量不能是负数！");
        }else if (capacity == 0){
            elementData = new Object[DEFAULT_CAPACITY];
        }else {
            elementData = new Object[capacity];
        }

        elementData = new Object[capacity];

    }

    public void add(E element){
        //什么时候需要扩容
        if (size == elementData.length){
            //怎么扩容
            //Object[] newArray = new Object[elementData.length<<1];                        //<<1相当于length*2
            Object[] newArray = new Object[elementData.length + (elementData.length>>1)];   //>>1相当于length/2
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }

        elementData[size++] = element;
    }

    //get()
    public E get(int index){
        checkRange(index);
        return (E)elementData[index];
    }

    //set
    public void set(E element,int index){
        checkRange(index);
        elementData[index] = element;
    }

    //索引合法判断[0,size]
    public void checkRange(int index){
        //不合法
        if (index < 0 || index >size-1){
            throw new RuntimeException("索引不合法: " + index);
        }
    }

    //重写toString()
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i <size; i++){
            sb.append(elementData[i] + ",");

        }
        sb.setCharAt(sb.length()-1,']');        //最后一个,换成]

        return sb.toString();
    }


    public static void main(String[] args) {
        MKArrayList04 s1 = new MKArrayList04(20);       //设置默认数组长度

        for (int i = 0;i < 40;i++){
            s1.add("AB" + i);
        }

        s1.set("aaa",10);
        System.out.println("s1 = " + s1);
        System.out.println(s1.get(10));

    }
}
