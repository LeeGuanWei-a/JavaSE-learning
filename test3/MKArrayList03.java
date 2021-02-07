package test3;

//自定义实现一个ArrayList
//添加泛型
//添加数组扩容

public class MKArrayList03<E> {

    private Object[] elementData;       //存储内容
    private int size;                   //数组大小
    private static final int DEFAULT_CAPACITY = 10;     //设置默认数组长度

    public MKArrayList03(){
        elementData = new Object[DEFAULT_CAPACITY];    //设置默认数组长度

    }

    public MKArrayList03(int capacity){
        elementData = new Object[capacity];

    }

    public void add(E element){
        //什么时候需要扩容
        if (size == elementData.length){
            //怎么扩容
            //Object[] newArray = new Object[elementData.length<<1];                    //<<1相当于length*2
            Object[] newArray = new Object[elementData.length + (elementData.length>>1)];   //>>1相当于length/2
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }

        elementData[size++] = element;
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
        MKArrayList03 s1 = new MKArrayList03(20);       //设置默认数组长度

        for (int i = 0;i < 40;i++){
            s1.add("AB" + i);
        }

        System.out.println("s1 = " + s1);
    }
}
