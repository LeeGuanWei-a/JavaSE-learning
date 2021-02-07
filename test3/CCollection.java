package test3;
//泛型的使用


import java.util.Arrays;

public class CCollection {
    public static void main(String[] args) {

        Mycollection mc = new Mycollection();
        mc.set("2222",0);
        mc.set(9999,1);

        String a = (String) mc.get(0);
        Integer b = (Integer) mc.get(1);
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //泛型的使用
        MyCollection<String> mcs = new MyCollection<>();    //String是实参
        mcs.set("333",0);

        String c = mcs.get(0);
        System.out.println("c = " + c);

    }
}


class Mycollection{
    Object[] objects = new Object[5];

    public void set(Object object,int index){
        objects[index] = object;
    }

    public Object get(int index){
        return objects[index];
    }
}

//泛型的定义
class MyCollection<E>{          //E是形参，一般使用T，E，V
    Object[] objects = new Object[5];

    public void set(E e,int index){
        objects[index] = e;
    }

    public E get(int index){
        return (E)objects[index];
    }
}