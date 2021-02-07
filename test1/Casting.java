package test1;//对象的转型，向上自动转型，向下强制转型

public class Casting {
    public static void main(String[] args) {
        Animal2 d = new Dog2();     //自动向上转型
        animalCry(d);
        //d.watchDoor();            //不能使用Dogs类下独有的方法

        Dog2 d2 =(Dog2)d;           //强制向下转型
        d2.watchDoor();             //需要重新转化为Dog2类的对象，才能使用Dogs类下独有的方法

        Animal2 c = new Cat2();
        Dog2 d3 =(Dog2)c;           //java.lang.ClassCastException类型转化错误，本身是Cat2类的对象，Cat2类与Dog2类没有关系，不能使用Dogs类下独有的方法
        d3.watchDoor();

    }

    static void animalCry(Animal2 animal){
        animal.Cry();
    }
}



class Animal2{
    public void Cry(){
        System.out.println("叫了一声！");
    }
}

class Cat2 extends Animal2{
    public void Cry(){
        System.out.println("喵喵喵！");
    }
}

class Dog2 extends Animal2{
    public void Cry(){
        System.out.println("汪汪汪！");
    }
    public void watchDoor(){
        System.out.println("看门");
    }
}