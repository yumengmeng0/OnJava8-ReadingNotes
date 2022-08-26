package chapter08;

/**
 * @author: ymm
 * @date: 2022/8/25
 * @version: 1.0.0
 * @description:
 */
public class Line extends Shape {
    public Line(int i) {
        super(i);
        System.out.println("Line constructor" + i);
    }
    @Override
    void dispose() {
        System.out.println("Line dispose");
        super.dispose();
    }

}
