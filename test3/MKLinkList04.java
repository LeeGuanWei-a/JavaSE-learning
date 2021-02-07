package test3;

//自定义实现LinkList
//实现添加
//实现get()
//实现remove()
//实现插入

public class MKLinkList04 {

    private Node first;     //第一个节点
    private Node last;
    private int size;

    //插入(首节点，末节点的处理)
    public void add(int index,Object object){

        Node newNode = new Node(object);        //新节点
        Node temp = getNode(index);             //要插入的节点位置

        if (temp != null){
            Node up = temp.previous;            //up: 要插入节点位置的前一个节点

            up.next = newNode;
            newNode.previous = up;

            newNode.next = temp;
            temp.previous = newNode;
        }

    }

    //remove()
    public void remove(int index){
        Node temp = getNode(index);

        if (temp != null){
            Node up = temp.previous;
            Node down = temp.next;

            if (up != null){
                up.next = down;
            }
            if (down != null){
                down.previous = up;
            }

            //被删除的元素是第一个元素时
            if (index == 0){
                first =down;
            }

            //被删除的元素是最后一个元素时
            if (index == size-1){
                last = up;
            }

            size --;
        }

    }

    public Object get(int index){

        if (index < 0 || index > size-1){
            throw new RuntimeException("索引不合法！ " + index);
        }
        Node temp = getNode(index);


        return temp != null?temp.element:null;
    }


    public Node getNode(int index){
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
        return temp;
    }

    //顺序添加
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

        MKLinkList04 list01 = new MKLinkList04();
        list01.add("a");
        list01.add("b");
        list01.add("c");
        list01.add("d");
        list01.add("e");
        list01.add("f");

        System.out.println("list01 = " + list01);
        System.out.println(list01.get(5));
        list01.remove(0);
        System.out.println("list01 = " + list01);
    }

}
