package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description:
 */
public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        @Override
        public void howdy() {
            System.out.println("Howdy");
        }
    }

    public static void main(String[] args) {
        new Test().howdy();
    }
}
