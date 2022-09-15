package chapter12.collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: ymm
 * @date: 2022/9/1
 * @version: 1.0.0
 * @description:
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // 自动装箱
            c.add(i);
        }

        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
