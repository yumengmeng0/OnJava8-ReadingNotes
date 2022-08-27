package chapter09.polymorphism.music;

import java.awt.event.MouseAdapter;

/**
 * @author: ymm
 * @date: 2022/8/26
 * @version: 1.0.0
 * @description: 继承与向上转型
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        tune(wind); // 向上转型
    }
}
