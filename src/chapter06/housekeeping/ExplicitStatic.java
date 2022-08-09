package chapter06.housekeeping;

/**
 * @author: ymm
 * @date: 2022/8/9
 * @version: 1.0.0
 * @description:
 */
public class ExplicitStatic {

    public static void main(String[] args) {
        System.out.println("main()");
        Cups.cup1.f(99); // [1]
    }

//    static Cups cup1 = new Cups(); // [2]
//    static Cups cup2 = new Cups(); // [2]
}


class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}