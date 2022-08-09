package chapter06;

import com.onjava.Nap;

/**
 * @author: ymm
 * @date: 2022/8/8
 * @version: 1.0.0
 * @description: 使用finalize()来检查对象是否被正确清理
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // 正确清理
        novel.checkIn();
        // 没有清理就丢掉了该对象的引用
        new Book(true);
        System.gc(); // 强制垃圾收集和终结操作
        new Nap(1);// 延迟1s
    }
}

class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error:checked out");
        }
//        super.finalize();
    }
}