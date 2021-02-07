package test3;

//自定义一个HashMap
//实现put()方法增加键值对，并解决了键重复的时候覆盖响应节点
//实现toString()方法
//实现get(),根据键对象获得对应的值对象

import java.util.Arrays;

public class MKHashMap03 {

    Node2[] table;          //位桶数组，bucket array
    int size;               //存放的键值对的个数

    public MKHashMap03(){
        table = new Node2[16];      //数组长度一般定义成2的整数幂

    }

    //get()
    public Object get(Object key){
        int hash = myHash(key.hashCode(),table.length);
        Object value = null;

        if (table[hash] != null){
            Node2 temp = table[hash];

            while (temp != null){
                if (temp.key.equals(key)){          //如果相等，说明找到了键值对，返回相应的value
                    value = temp.value;
                    break;
                }else {
                    temp = temp.next;
                }
            }
        }
        return value;
    }


    public void put(Object key,Object value){

        //需要考虑数组扩容++
        //定义新的节点对象
        Node2 newNode = new Node2();
        newNode.hash = myHash(key.hashCode(),table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node2 temp = table[newNode.hash];

        Node2 iterLast = null;          //正在遍历的最后一个元素
        boolean keyRepeat = false;      //默认key没有重复

        if (temp == null){
            //此处数组元素为空，则直接将新节点放进去
            table[newNode.hash] = newNode;
            size ++;

        }else {
            //此处数组元素不为空，则遍历对应链表
            while (temp != null){

                //判断key如果重复，则覆盖
                if (temp.key.equals(key)){

                    keyRepeat = true;
                    temp.value = value;         //覆盖原有的value，其他值不变(key,hash,next)
                    break;

                }else {
                    //key不重复,则遍历下一个
                    iterLast = temp;
                    temp =temp.next;

                }

            }

            if (!keyRepeat){                         //如果没有key重复，添加到链表的最后
                iterLast.next = newNode;
                size ++;

            }

        }

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");
        //遍历bucket数组
        for (int i = 0;i < table.length;i ++){
            Node2 temp =table[i];
            //遍历链表
            while (temp != null){
                sb.append(temp.key + " = " + temp.value +" ,");

                temp = temp.next;
            }

        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();

    }

    //求hash值
    public static int myHash(int v,int length){
        //System.out.println("位运算hash值 = " + (v & (length - 1)));       //直接位运算，效率高
        //System.out.println("取模运算hash值 = " + (v % (length - 1)));       //取模运算，效率低

        return v & (length - 1);
    }


    public static void main(String[] args) {
        MKHashMap03 map01 = new MKHashMap03();
        map01.put(10,"aa");
        map01.put(20,"bb");
        map01.put(30,"cc");
        map01.put(30,"dd");

        map01.put(53,"gg");
        map01.put(69,"ff");
        map01.put(85,"kk");

        System.out.println(map01);

/*        for (int i = 10; i < 100; i++){
            System.out.println(i + "---" +myHash(i,16));
        }*/

        System.out.println("map = " + map01.get(69));
    }

}
