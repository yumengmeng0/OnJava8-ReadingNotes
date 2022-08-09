package chapter06.housekeeping;

/**
 * @author: ymm
 * @date: 2022/8/9
 * @version: 1.0.0
 * @description: 用省略号定义一个可变参数列表
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}
