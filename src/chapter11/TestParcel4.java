package chapter11;

// 'chapter11.innerclass.Parcel4' is not public in 'chapter11.innerclass'. Cannot be accessed from outside package
//import chapter11.innerclass.Parcel4;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description:
 */
public class TestParcel4 {
    public static void main(String[] args) {

        // Parcel4不是public的
//        Parcel4 parcel4 = new Parcel4();
    }

    class BClass {
        private int b = 1;
    }

    static class StaticClass {
        private int c = 1;
    }
}

class AClass {
    private int a = 1;
}
