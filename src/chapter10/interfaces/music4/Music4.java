package chapter10.interfaces.music4;

import chapter09.polymorphism.music.Note;

/**
 * @author: ymm
 * @date: 2022/8/28
 * @version: 1.0.0
 * @description: 抽象类和抽象方法
 */
public class Music4 {
    static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        // 乐队
        Instrument[] orchestra = {
          new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()
        };
        tuneAll(orchestra);
    }
}

abstract class Instrument {
    private int i;

    public abstract void play(Note note);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}

// 打击乐器
class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Percussion.play() " + note);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

// 弦
class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

// 铜管乐器/吹奏乐器
class Brass extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    public String what() {
        return "Brass";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play() " + note);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}