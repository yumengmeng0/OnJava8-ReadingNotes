package chapter13.functional;

import java.util.function.IntSupplier;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class Closure5 {
    IntSupplier makeFun(int x) {
        int i = 0;
//        x++;
//        i++;
        return () -> x + i;
    }

    IntSupplier makeFu2(int x) {
        int i = 0;
        x++;
        i++;
        final int iFinal = i;
        final int xFinal = x;
        return () -> xFinal + iFinal;
    }
}
