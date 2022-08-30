package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: Parcel7的扩充版本
 */
public class Parcel7b {
    class MyContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents(){
        return new MyContents();
    }
    public static void main(String[] args) {
        Parcel7b parcel7b = new Parcel7b();
        Contents contents = parcel7b.contents();
    }
}
