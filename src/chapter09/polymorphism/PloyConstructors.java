package chapter09.polymorphism;

/**
 * @author: ymm
 * @date: 2022/8/27
 * @version: 1.0.0
 * @description: 构造器和多态，不会生成你所期望的结果
 */
public class PloyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
    /*
Glyph() before draw()
RoundGlyph.draw(), radius = 0 // 此时radius还未被初始化为1
Glyph() after draw()
RoundGlyph.RoundGlyph(), radius = 5
    */
}

// Glyph 石雕符号; 象形文字
class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
