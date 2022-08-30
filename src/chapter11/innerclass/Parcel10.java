package chapter11.innerclass;

import java.util.Map;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 使用“实例初始化”来执行匿名内部类的构造
 */
public class Parcel10 {
    public Destination destination(final String dest, final float price) {

        return new Destination() {
            private int cost;
            private String label = dest;

            { // 为每个对象执行实例初始化
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget（超出预算）");
                }
            }

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 parcel10 = new Parcel10();
        Destination destination = parcel10.destination("beijing", 101.395F);
    }
}
