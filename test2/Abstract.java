package test2;//抽象类，抽象方法的使用


public abstract class Abstract {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
        dog.run();

        Abstract a = new Dog();
        a.shout();
        a.run();

        //Abstract b = new Abstract();      //抽象类不能初始化
    }
    //父类没有实现方法，子类必须实现
    abstract public void shout();       //抽象方法必须在抽象类里

    public void run(){
        System.out.println("跑跑跑！");
    }
}
//
class Dog extends Abstract{

    @Override
    public void shout() {
        System.out.println("汪汪汪！");
    }
}
