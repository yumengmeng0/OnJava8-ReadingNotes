package chapter10.interfaces;

/**
 * @author: ymm
 * @date: 2022/8/28
 * @version: 1.0.0
 * @description:
 */
public class AnImplementation implements AnInterface {
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }
}
