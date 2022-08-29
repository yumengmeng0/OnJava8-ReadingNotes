package chapter10.interfaces.interfaceprocessor;

import java.util.Arrays;

/**
 * @author: ymm
 * @date: 2022/8/29
 * @version: 1.0.0
 * @description:
 */
public interface StringProcessor extends Processor {
    @Override
    String process(Object input);

    String S = "Hello World!";

    public static void main(String[] args) {
        Applicator.apply(new Upcase(),S);
        Applicator.apply(new Downcase(),S);
        Applicator.apply(new Splitter(),S);
    }

}

class Upcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase implements StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter implements StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
