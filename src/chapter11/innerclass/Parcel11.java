package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 嵌套类
 */
public class Parcel11 {
    public static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static final class ParcelDestination implements Destination {
        private String label;

        public ParcelDestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }

        // 嵌套类可以包含其他静态元素
        public static void f() {
        }

        static int x = 10;

        static class AntherLevel {
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static void main(String[] args) {
        Contents contents = contents();
        Destination destination = destination("Beijing");
    }
}
