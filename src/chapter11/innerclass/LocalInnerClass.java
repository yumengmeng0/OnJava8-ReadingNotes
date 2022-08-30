package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 保存一个对象序列
 */
public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        // 局部内部类
        class LocalCounter implements Counter {
            public LocalCounter() { // 局部内部类可以有构造器
                System.out.println("LocalCounter");
            }

            @Override
            public int next() {
                System.out.print(name); // 访问局部的final变量
                return count++;
            }
        }
        return new LocalCounter();
    }

    // 用匿名内部类实现同样的功能
    Counter getCounter2(final String name) {
        return new Counter() {
            {
                System.out.println("Counter()");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        Counter c1 = localInnerClass.getCounter("Local Inner "),
                c2 = localInnerClass.getCounter2("Anonymous inner ");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }

}

interface Counter {
    int next();
}
