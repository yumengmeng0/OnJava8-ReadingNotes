package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description:
 */
public class TestParcel {

    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Contents contents = parcel4.contents();
        Destination destination = parcel4.destination("北京");
        // 非法-不能访问private类
        //        parcel4.new PContents()
    }
}

// Parcel4被编译为独立的.class文件，只在本包可见
class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected final class PDestination implements Destination {
        private String label;

        public PDestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Contents contents() {
        return new PContents();
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }
}