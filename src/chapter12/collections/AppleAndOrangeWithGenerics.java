package chapter12.collections;

import java.util.ArrayList;

/**
 * @author: ymm
 * @date: 2022/9/1
 * @version: 1.0.0
 * @description:
 */
public class AppleAndOrangeWithGenerics {
    public static void main(String[] args) {
        // 右侧<>内没有类型信息，称为钻石语法
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
            //Error:(16, 24) java: 不兼容的类型: chapter12.collections.Orange无法转换为chapter12.collections.Apple
//            apples.add(new Orange()); // 编译时出错
        }
        for (Apple apple : apples) {
            System.out.println("apple.id() = " + apple.id());
        }
    }
}
