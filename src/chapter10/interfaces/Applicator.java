package chapter10.interfaces;

import java.util.Arrays;

/**
 * @author: ymm
 * @date: 2022/8/29
 * @version: 1.0.0
 * @description: 策略模式：根据传递的参数来表现出不同的行为
 */
public class Applicator {
    public static void apply(Processor processor, Object s) {
        System.out.println("Using Processor " + processor.name());
        System.out.println(processor.process(s));
    }

    public static void main(String[] args) {
        String s = "Hello World!";
        apply(new Upcase(), s);
        apply(new Downcase(), s);
        apply(new Splitter(), s);
    /*
Using Processor Upcase
HELLO WORLD!
Using Processor Downcase
hello world!
Using Processor Splitter
[Hello, World!]
    */
    }

}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    // 协变返回
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    // 协变返回
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    // 协变返回
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

