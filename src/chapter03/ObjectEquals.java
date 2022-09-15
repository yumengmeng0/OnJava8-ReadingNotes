package chapter03;

/**
 * @author YuMengMeng
 * @date 2022/9/14
 */

public class ObjectEquals {
    public static void main(String[] args) {
        Integer i1 = 11;
        Integer i2 = 11;

        Integer i11 = 1111;
        Integer i22 = 1111;
        System.out.println(i1 == i2); // true
        System.out.println(i11 == i22); // false

        System.out.println(i11.equals(i22)); // true
    }
}
