package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 使用.new创建内部类的实例
 */
public class Parcel3 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        public Destination(String whereTo) {
            this.label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 parcel3 = new Parcel3();
        Parcel3.Contents contents = parcel3.new Contents();
        Parcel3.Destination dest = parcel3.new Destination("北京");
    }
}
