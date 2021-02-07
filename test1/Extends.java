package test1;//继承的使用
//instanceof()的使用
//Java只有单继承

import java.util.Arrays;

public class Extends {
    public static void main(String[] args) {

        Student1 stu1=new Student1();
        stu1.name="李观伟";
        stu1.height=175;
        stu1.major="计算机专业";
        stu1.rest();

        Student stu2=new Student("李四",175,"会计专业");
        stu2.study();

        Teacher teacher=new Teacher("张三",176,"软件工程","广东省");
        teacher.teaching();

        //instanceof()用于判断一个对象属于哪一个类
        System.out.println(stu2 instanceof Student);
        System.out.println(stu2 instanceof Person);
        System.out.println(stu2 instanceof Object);
        System.out.println(new Person() instanceof Student);
        System.out.println(stu2 instanceof Teacher);
    }
}

class Person /*extends Object*/{        //PS.如果只定义一个类，没有调用extends时，该类的父类为Object  ,java.lang.Object
    String name;
    int height;

    public void rest(){
        System.out.println("休息一会！");
    }
}

//原始写法
class Student1{
    String name;
    int height;
    String major;

    public void study(){
        System.out.println("学习一会！");
    }

    public void rest(){
        System.out.println("休息一会！");
    }
}

//继承方式的写法
class Student extends Person{
    String major;

    public void study(){
        System.out.println("学习一会！");
    }

    public Student(String name,int height, String major){
        this.name=name;
        this.height=height;
        this.major=major;
    }

}

//Java不能实现多继承，只能实现单继承，C++可以实现多继承
/*
class Teacher extends Person,Teacher{            //Class cannot extend multiple classes

}*/


class Teacher extends Student{
    String address;

    public void teaching(){
        System.out.println("上一门课程！");
    }

    public Teacher(String name, int height, String major, String address) {
        super(name, height, major);
        this.address=address;
    }
}
