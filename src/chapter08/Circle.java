package chapter08;

/**
 * @author: ymm
 * @date: 2022/8/25
 * @version: 1.0.0
 * @description:
 */
public class Circle extends Shape {
    public Circle(int i) {
        super(i);
        System.out.println("Circle constructor" + i);
    }

    @Override
    void dispose() {
        System.out.println("Circle dispose");
        super.dispose();
    }
}
