package test1;
//静态函数与静态变量

import java.util.Arrays;

public class Static {
    int id;
    String name;
    static String company="阿里";                 //静态变量

    //构造一个Static对象
    public  Static(int id,String name){
        this.id=id;
        this.name=name;
    }

    public  void login(){
        printCompany();                            //非静态方法里可以使用静态方法
        System.out.println(company);               //非静态方法里可以使用静态属性
        System.out.println("登录:"+name);
    }

    public static void printCompany() {
        //login();                                  //静态方法里不能使用非静态方法
        System.out.println(company);
    }

    public static void main(String[] args) {
        Static s= new Static(001,"李观伟");
        Static.printCompany();
        Static.company="腾讯";
        Static.printCompany();
    }

}

