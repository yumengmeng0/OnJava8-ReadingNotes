package chapter09.polymorphism;

/**
 * @author: ymm
 * @date: 2022/8/27
 * @version: 1.0.0
 * @description: 清理共享对象
 */
public class ReferenceCounting {

    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };

        for (Composing composing : composings) {
            composing.dispose();
        }
    }
    /*
Creating Shared 0
Creating Composing 0
Creating Composing 1
Creating Composing 2
Creating Composing 3
Creating Composing 4
Disposing Composing 0
Disposing Composing 1
Disposing Composing 2
Disposing Composing 3
Disposing Composing 4
Disposing Shared 0
    */
}

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    public void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    public void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}