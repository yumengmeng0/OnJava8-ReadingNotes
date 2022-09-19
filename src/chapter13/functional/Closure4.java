package chapter13.functional;

import java.util.function.IntSupplier;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class Closure4 {
    IntSupplier makeFun(final int x) {
        final int i = 0;
        return () -> x + i;
    }
}
