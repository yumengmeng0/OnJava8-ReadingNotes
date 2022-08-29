package chapter10.interfaces.interfaceprocessor;

/**
 * @author: ymm
 * @date: 2022/8/29
 * @version: 1.0.0
 * @description:
 */
public class Applicator {
    public static void apply(Processor processor, Object s){
        System.out.println("Using Processor " + processor.name());
        System.out.println(processor.process(s));
    }
}
