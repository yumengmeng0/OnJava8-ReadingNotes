package chapter09.polymorphism;

/**
 * @author: ymm
 * @date: 2022/8/26
 * @version: 1.0.0
 * @description: 试图重写一个private方法，用@Override来检测意外重写
 */
public class PrivateOverride2 {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride2 po = new Derived2();
        po.f();
    }
}

class Derived2 extends PrivateOverride2 {
    //@Override  // Method does not override method from its superclass
    // Error:(21, 2) java: 方法不会覆盖或实现超类型的方法
    public void f() {
        System.out.println("public f()");
    }
}