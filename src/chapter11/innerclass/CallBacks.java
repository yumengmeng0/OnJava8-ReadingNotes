package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 使用内部类来支持回调
 */
public class CallBacks {
    public static void main(String[] args) {
        Callee1 callee1 = new Callee1();
        Callee2 callee2 = new Callee2();
        MyIncrement.f(callee2);

        Caller caller1 = new Caller(callee1);
        Caller caller2 = new Caller(callee2.getCallBackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}

interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println("i = " + i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement myIncrement) {
        myIncrement.increment();
    }
}


class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println("i = " + i);
    }

    private class Closure implements Incrementable {
        @Override
        public void increment() {
            // 需要指定调用外围类方法，否则会无限递归
            Callee2.this.increment();
        }
    }

    Incrementable getCallBackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;

    public Caller(Incrementable callbackReference) {
        this.callbackReference = callbackReference;
    }

    void go() {
        callbackReference.increment();
    }
}



