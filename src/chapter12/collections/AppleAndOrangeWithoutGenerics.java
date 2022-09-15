package chapter12.collections;

import java.util.ArrayList;

/**
 * @author: ymm
 * @date: 2022/8/31
 * @version: 1.0.0
 * @description: 简单集合类型的使用，忽略编译器警告
 */
public class AppleAndOrangeWithoutGenerics {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();

        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // 向apples添加Orange不会出问题
        apples.add(new Orange());

        for (Object apple : apples) {
            // Orange只有在运行时才会被检测出来
//            ((Apple)apple).id(); // ClassCastException
        }
    }
}

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}