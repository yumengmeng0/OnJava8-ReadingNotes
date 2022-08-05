package chapter04.operators;

/**
 * @author: ymm
 * @date: 2022/8/5
 * @version: 1.0.0
 * @description:
 */
public class Equivalence {

    static void show(String desc, Integer n1, Integer n2) {
        System.out.println(desc + "：");
        System.out.printf("%d = %d %b %b%n", n1, n2, n1 == n2, n1.equals(n2)); // %n 换行
    }

    public static void test(int value) {
        Integer i1 = value;
        Integer i2 = value;
        show("自动类型转换 Automatic", i1, i2);

        Integer r1 = new Integer(value); // 该方法；this.value = value; 没用到缓存
        Integer r2 = new Integer(value);
        show("new Integer()", r1, r2);

        Integer v1 = Integer.valueOf(value);// 该方法用到了Integer的缓存
        Integer v2 = Integer.valueOf(value);
        show("Integer.valueOf()", v1, v2);

        int x = value;
        int y = value;
        System.out.printf("基本数据类型int Primitive int：");
        System.out.printf("%d = %d %b%n", x, y, x == y);

    }

    public static void main(String[] args) {
        test(127);
        test(128);
    }

/*
自动类型转换 Automatic：
127 = 127 true true
new Integer()：
127 = 127 false true
Integer.valueOf()：
127 = 127 true true
基本数据类型int Primitive int：127 = 127 true
自动类型转换 Automatic：
128 = 128 false true
new Integer()：
128 = 128 false true
Integer.valueOf()：
128 = 128 false true
基本数据类型int Primitive int：128 = 128 true
*/

}
