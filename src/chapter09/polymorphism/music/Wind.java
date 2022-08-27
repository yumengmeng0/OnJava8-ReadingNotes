package chapter09.polymorphism.music;

/**
 * @author: ymm
 * @date: 2022/8/26
 * @version: 1.0.0
 * @description:
 */
public class Wind extends Instrument{

    @Override
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }
}
