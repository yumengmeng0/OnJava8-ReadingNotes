package chapter13.functional;

import java.util.function.IntSupplier;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class SharedStorage {
    public static void main(String[] args) {
        Closure1 closure1 = new Closure1();
        IntSupplier f1 = closure1.makeFun(0);
        IntSupplier f2 = closure1.makeFun(0);
        IntSupplier f3 = closure1.makeFun(0);

        System.out.println(f1.getAsInt());
        System.out.println(f2.getAsInt());
        System.out.println(f3.getAsInt());
    }
/*
0
1
2
 */
}
