package chapter10.interfaces;

/**
 * @author: ymm
 * @date: 2022/8/28
 * @version: 1.0.0
 * @description: 实现不同接口，函数签名冲突
 */
public class MICollision {

    public static void main(String[] args) {

    }
}

interface Bob1 {
    default void bob() {
        System.out.println("Bob1.bob()");
    }
}

interface Bob2 {
    default void bob() {
        System.out.println("Bob2.bob()");
    }
}

//Error:(28, 1) java: 类型 chapter10.interfaces.Bob1 和 chapter10.interfaces.Bob2 不兼容；
//        类 chapter10.interfaces.Bob从类型 chapter10.interfaces.Bob1 和 chapter10.interfaces.Bob2 中继承了bob() 的不相关默认值
//class Bob implements Bob1, Bob2 {
//
//}

interface Sam1 {
    default void sam() {
        System.out.println("Sam1.sam()");
    }
}

interface Sam2 {
    default void sam(int i) {
        System.out.println("Sam2.sam()");
    }
}

class Sam implements Sam1, Sam2 {

}