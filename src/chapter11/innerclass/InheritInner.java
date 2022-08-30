package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 继承一个内部类
 */
public class InheritInner extends WithInner.Inner {
//    No enclosing instance of type 'chapter11.innerclass.WithInner' is in scope
//    public InheritInner() { // 不能编译
//    }

    public InheritInner(WithInner withInner) {
        withInner.super(); // 必须有这一步
    }


}


class WithInner {
    class Inner {

    }
}

