package test1;//Object的toString方法及重写toString方法


import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        ToString ts = new ToString();
        System.out.println(ts);     //等同于System.out.println(ts.toString());

        Human human = new Human("李观伟",22);
        System.out.println(human.toString());
    }

    public String toString(){
        return "重写toString方法";
    }

}

class Human{
    String name;
    int age;

    public String toString(){
        return "姓名:"+name+",年龄:"+age;
    }

    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
}
