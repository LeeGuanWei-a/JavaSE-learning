package test1;//方法的重写

public class Override {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.run();
    }
}


class Car{
    public void run(){
        System.out.println("跑。。。");
    }

    public  void stop(){
        System.out.println("停止！");
    }

    public Person who(){
        return new Person();
    }
}

class Horse extends Car{
    public void run(){              //方法名，形参列表相同
        System.out.println("马儿急蹄。。。");
    }

    public Student who(){         //方法的重写
        return new Student("李四",175,"会计专业");
    }

    /*public Object who(){            //'who()' in 'Horse' clashes with 'who()' in 'Car'; attempting to use incompatible return type
        return new Object();          //重写方法的返回值类型需要小于等于父类
    }*/
}