package chapter06.housekeeping;

import java.util.Arrays;

/**
 * @author: ymm
 * @date: 2022/8/9
 * @version: 1.0.0
 * @description:
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3,};
        Integer[] b = new Integer[]{1, 2, 3,};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }

}
