package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 返回一个指向内部类的引用
 */
public class Parcel2 {
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

    public Contents contents() {
        return new Contents();
    }

    public Destination destination(String dest) {
        return new Destination(dest);
    }

    public void ship(String dest) {
        Contents contents = contents();
        Destination destination = destination(dest);
        System.out.println("destination.readLabel() = " + destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 parcel1 = new Parcel2();
        parcel1.ship("Tasmania");
        Parcel2 parcel2 = new Parcel2();
        // 指向内部类的引用
        Parcel2.Contents contents = parcel1.contents();
        Parcel2.Destination destination = parcel1.destination("Borneo");
    }
}
