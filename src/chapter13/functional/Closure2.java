package chapter13.functional;

import java.util.function.IntSupplier;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class Closure2 {
    IntSupplier makeFun(int x) {
        int i = 0;
        // Variable used in lambda expression should be final or effectively final
        return () -> x + i;
    }
}
