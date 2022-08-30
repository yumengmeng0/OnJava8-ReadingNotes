package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 将一个类嵌入在方法中
 */
public class Parcel5 {

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination destination = parcel5.destination("北京");
    }

    public Destination destination(String s) {
        final class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                this.label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }
}
