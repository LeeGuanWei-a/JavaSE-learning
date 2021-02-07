package test3;

//自定义实现LinkList
//实现添加
//实现get()

import java.util.Arrays;

public class MKLinkList02 {

    private Node first;     //第一个节点
    private Node last;
    private int size;

    public Object get(int index){

        if (index < 0 || index > size-1){
            throw new RuntimeException("索引不合法！ " + index);
        }

        Node temp = null;

        if (index <= (size >> 1)){       //等于size/2
            temp =first;
            for (int i = 0 ;i < index; i++){
                temp = temp.next;
            }
        }else {
            temp = last;
            for (int i = size -1;i > index; i--){
                temp = temp.previous;
            }
        }

        return temp.element;
    }


    public void add(Object object){
        Node node = new Node(object);

        if (first == null){
            //node.previous = null;
            //node.next = null;

            first = node;
            last = node;
        }else {
            node.previous = last;
            node.next = null;
            last.next = node;
            last = node;

        }
        size++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        Node temp = first;
        while (temp != null){
            sb.append(temp.element + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {

        MKLinkList02 list01 = new MKLinkList02();
        list01.add("a");
        list01.add("b");
        list01.add("c");
        list01.add("d");
        list01.add("e");
        list01.add("f");

        System.out.println("list01 = " + list01);
        System.out.println(list01.get(5));
    }

}
