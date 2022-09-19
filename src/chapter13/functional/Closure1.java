package chapter13.functional;

import java.util.function.IntSupplier;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class Closure1 {
    int i;

    /**
     * makeFun返回的IntSupplier是在i和x之上构建的闭包
     * @param x
     * @return
     */
    IntSupplier makeFun(int x) {
        return () -> x + i++;
    }
}
