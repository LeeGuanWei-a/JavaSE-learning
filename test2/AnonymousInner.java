package test2;//匿名内部类的使用


public class AnonymousInner {
    public static void main(String[] args) {

        //定义匿名内部类类体
        AnonymousInner.test1(new AA() {
            @Override
            public void aa() {
                System.out.println("测试匿名内部类");
            }
        });

    }
    //调用匿名内部类
    public static void test1(AA a){
        a.aa();
    }

}

interface AA{
    void aa();
}
