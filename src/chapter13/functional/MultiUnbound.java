package chapter13.functional;

/**
 * 有多个参数未绑定方法
 *
 * @author YuMengMeng
 * @date 2022/9/17
 */

public class MultiUnbound {
    public static void main(String[] args) {
        TwoArgs twoArgs = This::two;
        This athis = new This();
        twoArgs.call2(athis, 11, 3.14);
    }
}

class This {
    void two(int i, double d) {
    }
}

interface TwoArgs {
    void call2(This athis, int i, double d);
}