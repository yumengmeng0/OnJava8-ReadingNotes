package chapter09.polymorphism;

/**
 * @author: ymm
 * @date: 2022/8/27
 * @version: 1.0.0
 * @description: 字段的直接访问是在编译时确定的
 */
public class FieldAccess {
    public static void main(String[] args) {
        Sup sup = new Sub();
        System.out.println("sup.field = " + sup.field + ",sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + ",sub.getField() = " + sub.getField() + ",sub.getSuperField() = " + sub.getSuperField());
    }
/*
sup.field = 0,sup.getField() = 1
sub.field = 1,sub.getField() = 1,sub.getSuperField() = 0
 */
}

class Sup {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Sup {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}