package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description:
 */
public class Parcel9 {
    // 要在匿名内部内中使用，参数必须是最终变量，或者“实际上的最终变量”（在初始化之后它永远不会改变）
    public Destination destination(final String dest) { // 不加final也能通过编译，但dest不能在函数内部被修改
//        dest = dest + " "; // Error:(17, 36) java: 从内部类引用的本地变量必须是最终变量或实际上的最终变量
        return new Destination() {
            // 匿名类不能有命名的构造器
//            public Destination() {}

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel9 = new Parcel9();
        Destination destination = parcel9.destination("北京");
    }
}
