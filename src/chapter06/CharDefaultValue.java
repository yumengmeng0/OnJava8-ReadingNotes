package chapter06;

/**
 * @author: ymm
 * @date: 2022/8/8
 * @version: 1.0.0
 * @description:
 */
public class CharDefaultValue {
    static char c;

    public static void main(String[] args) {
        System.out.println("-----" + c + "----"); // ----- ----
        System.out.println("c = " + (int) c); // 0
    }
}
