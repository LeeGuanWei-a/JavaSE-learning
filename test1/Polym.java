package test1;//多态的使用
//多态是方法的多态，不是属性的多态
//多态存在的3个必要条件：继承，方法的重写，父类引用指向子类对象


public class Polym {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animalCry(animal);

        Cat cat = new Cat();
        animalCry(cat);

        Dog dog = new Dog();
        animalCry(dog);

    }

    //不同类下相同的方法提取出来，用不同类的对象调用相同的方法，减少代码量
    static void animalCry(Animal animal){
        animal.Cry();
    }

}

class Animal{
    public void Cry(){
        System.out.println("叫了一声！");
    }
}

class Cat extends Animal{
    public void Cry(){
        System.out.println("喵喵喵！");
    }
}

class Dog extends Animal{
    public void Cry(){
        System.out.println("汪汪汪！");
    }
}