package chapter13.functional;

import java.util.function.Function;

/**
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class ConsumeFunction {
    static Two consume(Function<One, Two> onetwo) {
        return onetwo.apply(new One());
    }

    public static void main(String[] args) {
        Two two = consume(one -> new Two());
    }
}

class One {
}

class Two {
}
