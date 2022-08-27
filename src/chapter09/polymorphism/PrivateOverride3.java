package chapter09.polymorphism;

/**
 * @author: ymm
 * @date: 2022/8/26
 * @version: 1.0.0
 * @description: 视图重写一个private方法
 */
public class PrivateOverride3 {


    public static void main(String[] args) {
        PrivateOverride po = new Derived();
//        po.f(); // 'f()' has private access in 'chapter09.polymorphism.PrivateOverride'
    }
}

