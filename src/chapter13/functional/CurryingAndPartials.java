package chapter13.functional;

import java.util.function.Function;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class CurryingAndPartials {

    // 未柯里化
    static String uncurried(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Function<String, Function<String, String>> sum = a -> b -> a + b;

        System.out.println(uncurried("Hi ", "Ho"));

        // 参数化函数，
        Function<String, String> sumHi = sum.apply("Hup ");

        System.out.println(sumHi.apply("Ho"));
        System.out.println(sumHi.apply("Hey"));
    }
/*
Hi Ho
Hup Ho
Hup Hey
 */
}
