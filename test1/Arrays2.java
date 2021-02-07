package test1;//数组的三种初始化方法，静态初始化，动态初始化，默认初始化


public class Arrays2 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3};
        Class2[] class2 = {new Class2(001,"李观伟"),
                new Class2(002,"张三"),
                new Class2(003,"李四"),
        };

        //默认初始化
        int[] b = new int[2];                       //默认值：0,0
        boolean[] booleans = new boolean[2];        //默认值：false,false
        String[] strings = new String[2];           //默认值：null,null

        //动态初始化,通过数组下标进行赋值
        int[] c =new int[3];
        c[0] = 1;
        c[1] = 2;
        c[2] = 3;

    }
}


class Class2{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}