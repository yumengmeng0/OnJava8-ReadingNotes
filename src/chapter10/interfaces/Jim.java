package chapter10.interfaces;

/**
 * @author: ymm
 * @date: 2022/8/28
 * @version: 1.0.0
 * @description:
 */
public class Jim implements Jim1, Jim2 {

    // 重写接口中冲突的同名方法
    @Override
    public void jim() {
        System.out.println("Jim.jim()");
    }

    public static void main(String[] args) {
        new Jim().jim();
    }
}

interface Jim1 {
    default void jim() {
        System.out.println("Jim1.jim()");
    }
}

interface Jim2 {
    default void jim() {
        System.out.println("Jim2.jim()");
    }
}

