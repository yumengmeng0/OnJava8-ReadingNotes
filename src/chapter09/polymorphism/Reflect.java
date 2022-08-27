package chapter09.polymorphism;

/**
 * @author: ymm
 * @date: 2022/8/27
 * @version: 1.0.0
 * @description:
 */
public class Reflect {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();
        // 编译时错误：Cannot resolve method 'u' in 'Useful'
//      x[1].u();
        ((MoreUseful) x[1]).u(); // 向下转型/反射
//        ((MoreUseful) x[0]).u(); // 抛出异常：ClassCastException

    }
}

class Useful {
    public void f() {
    }

    public void g() {
    }
}

class MoreUseful extends Useful {
    @Override
    public void f() {

    }

    @Override
    public void g() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }
}
