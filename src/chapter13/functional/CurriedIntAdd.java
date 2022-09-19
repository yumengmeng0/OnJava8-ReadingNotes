package chapter13.functional;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class CurriedIntAdd {
    public static void main(String[] args) {
        // 处理基本类型的装箱，可以用适当的函数式接口
        IntFunction<IntUnaryOperator> curriedIntAdd = a -> b -> a + b;
        IntUnaryOperator add4 = curriedIntAdd.apply(4);
        System.out.println(add4.applyAsInt(5));
    }
/*
9
 */
}
