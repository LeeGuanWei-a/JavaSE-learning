package test1;//==,equals()的使用

import java.util.Arrays;
import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        Object object;
        String string;

        User user1 = new User(001,"李观伟");
        User user2 = new User(002,"李观伟");
        User user3 = new User(001,"李观伟");

        String s1 = new String("李观伟");
        String s2 = new String("李四");
        String s3 = new String("李观伟");

        //求两个对象是否相同的两种写法
        //Object类中 == ，equals()比较引用地址是否相同
        System.out.println(user1 == user2);         //false
        System.out.println(user1.equals(user2));    //false
        System.out.println(user1 == user1);         //true
        System.out.println(user1.equals(user1));    //true
        System.out.println(user1 == user3);         //false
        System.out.println(user1.equals(user3));    //false

        System.out.println("######################################### " );
        //String类中 == 比较引用地址是否相同，equals()比较两个字符串的内容是否相等
        System.out.println(s1 == s1);               //true
        System.out.println(s1 == s2);               //false
        System.out.println(s1 == s3);               //false
        System.out.println(s1.equals(s1));          //true
        System.out.println(s1.equals(s2));          //false
        System.out.println(s1.equals(s3));          //true
    }
}

class User {
    int id;
    String name;

    public User(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

/*    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return id == user.id;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(id);
    }*/
}