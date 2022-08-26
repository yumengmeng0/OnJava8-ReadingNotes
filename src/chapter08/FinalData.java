package chapter08;

import java.lang.ref.PhantomReference;
import java.util.Random;

/**
 * @author: ymm
 * @date: 2022/8/26
 * @version: 1.0.0
 * @description: final字段效果
 */
public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    // 可以是编译时常量
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // 典型的公共常量
    public static final int VALUE_THREE = 39;
    // 不能作为编译时常量
    private final int i4 = rand.nextInt(20);
}

class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}
