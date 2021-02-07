package test3;

//自定义实现一个ArrayList

public class MKArrayList01 {

    private Object[] elementData;       //存储内容
    private int size;                   //数组大小
    private static final int DEFAULT_CAPACITY = 10;     //设置默认数组长度

    public MKArrayList01(){
        elementData = new Object[10];    //设置默认数组长度

    }

    public MKArrayList01(int capacity){
        elementData = new Object[capacity];

    }

    public void add(Object object){
        elementData[size++] = object;
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
        MKArrayList01 s1 = new MKArrayList01(20);       //设置默认数组长度
        s1.add("aa");
        s1.add("bb");

        System.out.println("s1 = " + s1);
    }
}
