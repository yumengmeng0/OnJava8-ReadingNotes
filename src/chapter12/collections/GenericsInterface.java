package chapter12.collections;

import java.util.ArrayList;

/**
 * @author: ymm
 * @date: 2022/9/1
 * @version: 1.0.0
 * @description: 从JDK11开始
 */
public class GenericsInterface {
    void old() {
        ArrayList<Apple> apples = new ArrayList<>();
    }

    void modern() {
        var apples = new ArrayList<Apple>();
    }

    void pitFall() {
        var apples = new ArrayList<>();
        apples.add(new Apple());
        // 作为普通的Object类型返回
        apples.get(0);
    }
}
