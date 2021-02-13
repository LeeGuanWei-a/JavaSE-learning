package test4;

//对象序列化/反序列化的应用


import java.io.*;

//学生类(可序列化),实现Serializabler接口
class Student implements Serializable {
    String num;// 学号
    String name; // 姓名
    int age;// 年龄
    float average;// 平均成绩;

    Student(String s_id, String s_name, int s_age, float s_average){// 构造方法
        num = s_id;
        name = s_name;
        age = s_age;
        average = s_average;
    }

    public void displsy() {
        System.out.print(num + "\t");
        System.out.print(name + "\t");
        System.out.print(age + "\t");
        System.out.print(average + "\n");
    }
}

public class SerializableDemo {
    public static void main(String[] args) {
        // 创建三个对象
        Student zhang = new Student("0712345601", "张小三", 19, 87.6f);
        Student li = new Student("0712345602", "李阿四", 21, 90.3f);
        Student wang = new Student("0712345603", "王连五", 20, 77.2f);

        // 以下为序列化操作
        try {
            // 创建文件字节输出流,并以此生成对象输出流
            FileOutputStream file_out = new FileOutputStream("students.dat");
            ObjectOutputStream object_out = new ObjectOutputStream(file_out);
            // 向对象输出流写入数据
            object_out.writeObject(zhang);
            object_out.writeObject(li);
            object_out.writeObject(wang);
            object_out.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        // 以下为反序列化操作
        try {
            // 创建文件字节输入流,并以此生成对象输入流
            FileInputStream file_in = new FileInputStream("students.dat");
            ObjectInputStream object_in = new ObjectInputStream(file_in);
            Student st = null;
            int i;
            System.out.println("学号\t\t姓名\t年龄\t平均成绩");
            for (i = 0; i < 3; i++) {
                st = (Student) object_in.readObject();
                st.displsy();
            }
            object_in.close();
        } catch (ClassNotFoundException e) {
            System.out.println("不能读出对象!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
