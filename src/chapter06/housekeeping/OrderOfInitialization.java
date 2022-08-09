package chapter06.housekeeping;

/**
 * @author: ymm
 * @date: 2022/8/9
 * @version: 1.0.0
 * @description:
 */


public class OrderOfInitialization {
    public static void main(String[] args) {
        House house = new House();
        house.f();
    }
}


class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1);

    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);  // Variable 'w3' initializer 'new Window(3)' is redundant 冗余的
}