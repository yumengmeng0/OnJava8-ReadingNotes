package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description:
 */
public class BigEgg extends Egg {

    protected class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
/*
new Egg()
Egg.Yolk()
*/
    }
}

class Egg {
    private Yolk yolk;

    protected class Yolk { // 蛋黄
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public Egg() {
        System.out.println("new Egg()");
        yolk = new Yolk();
    }

}
