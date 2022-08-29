package chapter10.interfaces.interfaceprocessor;

/**
 * @author: ymm
 * @date: 2022/8/29
 * @version: 1.0.0
 * @description:
 */
public interface Processor {
    default String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input);
}


