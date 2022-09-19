package chapter13.functional;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Predicate谓词的逻辑运算
 *
 * @author YuMengMeng
 * @date 2022/9/19
 */

public class PredicateComposition {
    static Predicate<String> p1 = s -> s.contains("bar"),
            p2 = s -> s.length() < 5,
            p3 = s -> s.contains("foo"),
            p4 = p1.negate().and(p2).or(p3);

    public static void main(String[] args) {
        Stream.of("bar", "foobar", "foobaz","fongopuckey")
                .filter(p4)
                .forEach(System.out::println);
    }
/*
foobar
foobaz
 */
}
