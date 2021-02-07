package test1;//递归的使用

public class Recursive {
    public static void main(String[] args) {
        a();
    }

    static int count = 0;

    public static void a(){
        System.out.println("a");
        b();                        //在一个函数内调用其他函数
    //a();                        //调用本身，注意：在调用本身的时候会不停的启用内存资源，直到资源占满，此时会抛出异常
    }

    public static void b(){
        System.out.println("b");
    }

    //在调用自身时，使得在一定时间后停止调用自身
    public static void c() {
        System.out.println("c");
        count ++;
        if (count < 10){        //设置递归体，即什么时候调用自身
            c();
        }else {
            return;             //设置递归头，即什么时候不调用自身
        }
    }
}
