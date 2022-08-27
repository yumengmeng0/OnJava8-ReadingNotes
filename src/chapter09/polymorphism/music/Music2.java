package chapter09.polymorphism.music;

/**
 * @author: ymm
 * @date: 2022/8/26
 * @version: 1.0.0
 * @description: 使用重载而不是向上转型
 */
public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        Stringed stringed = new Stringed();
        Brass brass = new Brass();
        tune(wind);
        tune(stringed);
        tune(brass);
    }
}

class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }
}

class Brass extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }
}