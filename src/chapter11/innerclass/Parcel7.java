package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description:
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents(){
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents contents = parcel7.contents();
    }
}
