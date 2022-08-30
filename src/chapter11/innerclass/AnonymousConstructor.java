package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 为匿名内部类创建一个构造器
 */
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            { // 相当于匿名类的构造器
                System.out.println("Inside instance initializer");
//                i++; // Variable 'i' is accessed from within inner class, needs to be final or effectively final
            }

            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}

abstract class Base {
    Base(int i) {
        System.out.println("Base constructor, i = " + i);
    }

    public abstract void f();
}

