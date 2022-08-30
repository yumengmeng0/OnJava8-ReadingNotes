package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 被嵌入的类可以访问各层外部类的所有成员
 */
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A a = mna.new A();
        MNA.A.B b = a.new B();
        b.h();
    }
}

class MNA {
    private void f() {
    }

    class A {
        private void g() {

        }

        public class B {
            void h() {
                g();
                h();
            }
        }
    }

}