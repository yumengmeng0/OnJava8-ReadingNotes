package chapter08;

/**
 * @author: ymm
 * @date: 2022/8/25
 * @version: 1.0.0
 * @description:
 */
public class Shape {
    public Shape(int i) {
        System.out.println("Shape constructor" + i);
    }

    void dispose() {
        System.out.println("Shape dispose");
    }
}
