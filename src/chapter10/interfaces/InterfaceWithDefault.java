package chapter10.interfaces;

/**
 * @author: ymm
 * @date: 2022/8/28
 * @version: 1.0.0
 * @description: 有默认函数的接口
 */
public interface InterfaceWithDefault {
    void firstMethod();

    void secondMethod();

    default void newMethod() {
        System.out.println("newMethod");
    }
}
