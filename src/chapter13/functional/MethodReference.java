package chapter13.functional;

/**
 * @author YuMengMeng
 * @date 2022/9/16
 */

interface Callable {
    void call(String s);
}

class Descibe {
    void show(String msg) {
        System.out.println(msg);
    }
}

public class MethodReference {
    static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    static class Description {
        String about;

        Description(String desc) {
            about = desc;
        }

        void help(String msg) {
            System.out.println(about + " " + msg);
        }
    }

    static class Helper {
        static void assist(String msg) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Descibe descibe = new Descibe();
        Callable callable = descibe::show;
        callable.call("call()");

        callable = MethodReference::hello;
        callable.call("Bob");

        callable = new Description("valuable")::help;
        callable.call("information");

        callable = Helper::assist;
        callable.call("Helper!");
    }
/*
call()
Hello, Bob
valuable information
Helper!
 */

}
