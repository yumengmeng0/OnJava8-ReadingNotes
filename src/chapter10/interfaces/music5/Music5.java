package chapter10.interfaces.music5;

import chapter09.polymorphism.music.Note;

import java.beans.beancontext.BeanContext;

/**
 * @author: ymm
 * @date: 2022/8/28
 * @version: 1.0.0
 * @description:
 */
public class Music5 {
    static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        // 填充数组时会自动向上转型
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}

interface Instrument {
    // 编译时常量
    int VALUE = 5; // static final

    default void play(Note note) { // 自动是public
        System.out.println(this + ".play() " + note);
    }

    default void adjust() {
        System.out.println("Adjusting " + this);
    }
}

class Wind implements Instrument {
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {
    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {
    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}