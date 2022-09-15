package chapter12.collections;

import java.util.ArrayList;

/**
 * @author: ymm
 * @date: 2022/9/1
 * @version: 1.0.0
 * @description: 向上转型
 */
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple apple : apples) {
            System.out.println("apple = " + apple);
        }
    }
}

class GrannySmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Braeburn extends Apple {
}