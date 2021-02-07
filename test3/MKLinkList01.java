package test3;

//自定义实现LinkList
//实现添加

import java.util.Arrays;

public class MKLinkList01 {

    private Node first;     //第一个节点
    private Node last;
    private int size;


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

        MKLinkList01 list01 = new MKLinkList01();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");

        System.out.println("list01 = " + list01);
    }

}
