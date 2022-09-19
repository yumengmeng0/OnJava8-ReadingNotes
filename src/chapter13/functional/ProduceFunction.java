package chapter13.functional;

import java.util.function.Function;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class ProduceFunction {

    // 高阶函数
    static FuncSS produce() {
        return s -> s.toLowerCase();
    }

    public static void main(String[] args) {
        FuncSS f = produce();
        System.out.println(f.apply("YELLING"));
    }
/*
yelling
 */
}

interface FuncSS extends Function<String, String> {

}