package chapter13.functional;

/**
 * 使用Runnable接口的方法引用
 *
 * @author YuMengMeng
 * @date 2022/9/17
 */

public class RunnableMethodReference {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();

        new Thread(() -> System.out.println("lambda")).start();

        new Thread(Go::go).start();
    }
}

class Go {
    static void go() {
        System.out.println("Go::go()");
    }
}