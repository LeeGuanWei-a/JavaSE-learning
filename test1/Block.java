package test1;

//静态初始化块的使用
public class Block {
    int id;
    static String company;

    static {
        System.out.println("执行类的初始化");      //先执行静态代码块的内容，再构造对象
        company="阿里";
        printCompany();
    }

    private static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        Block b=null;
    }

}
