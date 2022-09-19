package chapter13.functional;

/**
 * 未绑定对象方法的引用
 *
 * @author YuMengMeng
 * @date 2022/9/17
 */

public class UnboundMethodReference {
    public static void main(String[] args) {
//        MakeString ms = X::f; // Non-static method cannot be referenced from a static context
        // X::f是类的非静态方法，代表者未绑定方法的引用
        TransformX sp = X::f;
        X x = new X();
        // 传入对象x
        System.out.println(sp.transform(x));
        // 效果相同
        System.out.println(x.f());
    }
}

class X {
    String f() {
        return "X::f()";
    }
}

interface MakeString {
    String make();
}

interface TransformX {
    String transform(X x);
}


