package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 创建内部类
 */
// Parcel 包裹
public class Parcel1 {
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

    public void ship(String dest) {
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println("destination.readLabel() = " + destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 parcel1 = new Parcel1();
        parcel1.ship("Tasmania");
    }
}
