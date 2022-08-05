package chapter04;

/**
 * @author: ymm
 * @date: 2022/8/5
 * @version: 1.0.0
 * @description:
 */
public class AutoInc {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int x = ++a;  // x 2
        int y = b++;  // y 1

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
