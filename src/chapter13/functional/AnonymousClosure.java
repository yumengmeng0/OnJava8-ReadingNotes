package chapter13.functional;

import java.util.function.IntSupplier;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class AnonymousClosure {
    IntSupplier makeFun(int x) {
        int i = 0;
        return new IntSupplier() {
            @Override
            public int getAsInt() {
                return x + i;
            }
        };
    }
}
