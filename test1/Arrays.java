package test1;//数组arrays的使用
//特点：数组长度是确定的，其元素必须是相同类型，数组类型可以是任何数据类型

public class Arrays {
    public static void main(String[] args) {
        //数组的两种写法
        int[] arr01 = new int[10];                //推荐
        String arr02[] = new String[20];

        //定义数组的两种写法
        Class[] arr03;              //数组的声明
        arr03 = new Class[3];      //给数组分配空间，并进行默认初始化

/*
        arr01[0] = 1;
        arr01[1] = 2;
        arr01[2] = 3;
*/
        //循环初始化数组
        for (int i = 0;i < arr01.length; i++){
            arr01[i] = 10 * i;

        }

        //遍历数组
        for (int i = 0;i < arr01.length; i++){
            System.out.println("arr01 = " + arr01[i]);

        }

        System.out.println("############################## " );
        Class[] arr04 = new Class[3];
        //arr04里存放着3个元素的引用地址，而非元素的值
        arr04[0] = new Class(001,"李观伟");
        arr04[1] = new Class(002,"张三");
        arr04[2] = new Class(003,"李四");

        for (int i = 0;i < arr04.length; i++){
            System.out.println("arr04 = " + arr04[i]);                  //显示元素的地址
        System.out.println("arr04[id] = " + arr04[i].getId());          //显示元素的id
            System.out.println("arr04[name] = " + arr04[i].getName());  //显示元素的name
        }
    }
}


class Class{
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

    public Class(int id, String name) {
        this.id = id;
        this.name = name;
    }
}