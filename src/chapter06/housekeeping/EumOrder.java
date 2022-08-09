package chapter06.housekeeping;

/**
 * @author: ymm
 * @date: 2022/8/9
 * @version: 1.0.0
 * @description:
 */
public class EumOrder {
    public static void main(String[] args) {
        for (Spiciness value : Spiciness.values()) {
            System.out.println(value + ", ordinal " + value.ordinal());
        }
    }
/*
NOT, ordinal 0
MILD, ordinal 1
MEDIUM, ordinal 2
HOT, ordinal 3
FLAMING, ordinal 4
 */
}
