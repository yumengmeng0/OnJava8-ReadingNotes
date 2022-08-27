package chapter09.polymorphism;

import java.net.DatagramPacket;

/**
 * @author: ymm
 * @date: 2022/8/26
 * @version: 1.0.0
 * @description: 视图重写一个private方法
 */
public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f(); // private f()
    }
}

class Derived extends PrivateOverride {
    public void f(){
        System.out.println("public f()" );
    }
}
