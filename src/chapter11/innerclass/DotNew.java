package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 使用.new语法直接创建一个内部类的对象
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner inner = dotNew.new Inner();
    }
}
