package chapter13.functional;

import java.util.function.Function;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class Curry3Args {

    public static void main(String[] args) {
        Function<String,
                Function<String,
                        Function<String, String>>> sum =
                a -> b -> c -> a + b + c;

        Function<String, Function<String, String>> hi =
                sum.apply("Hi ");

        Function<String, String> ho = hi.apply("Ho ");

        System.out.println(ho.apply("Hup"));
    }
/*
Hi Ho Hup
 */
}
