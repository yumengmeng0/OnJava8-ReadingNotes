package chapter13.functional;

/**
 * @author YuMengMeng
 * @date 2022/9/17
 */

public class CtorReference {

}

class Dog {
    String name;
    int age = -1;

    public Dog() {
        name = "stray";
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        MakeNoArgs makeNoArgs = Dog::new;
        Make1Args make1Args = Dog::new;
        Make2Args make2Args = Dog::new;

        Dog dog = makeNoArgs.make();
        Dog d1 = make1Args.make("Comet");
        Dog d2 = make2Args.make("Ralph", 4);
    }

}

interface MakeNoArgs {
    Dog make();
}

interface Make1Args {
    Dog make(String name);
}


interface Make2Args {
    Dog make(String name, int age);
}
