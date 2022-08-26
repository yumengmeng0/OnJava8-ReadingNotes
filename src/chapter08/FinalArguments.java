package chapter08;

/**
 * @author: ymm
 * @date: 2022/8/26
 * @version: 1.0.0
 * @description: final参数
 */
public class FinalArguments {
    void with(final Gizmo g) {
//        g = new Gizmo(); // Cannot assign a value to final variable 'g'
    }

    void without(Gizmo g) {
        g = new Gizmo();
    }
// i不能被修改
//    void f(final int i) {
//        i++;
//    }

    // final基本类型只能执行读操作
    int g(final int i) {
        return i + 1;
    }

}


class Gizmo {
    public void spin() {
    }
}