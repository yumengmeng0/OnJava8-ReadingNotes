package chapter09.polymorphism;

/**
 * @author: ymm
 * @date: 2022/8/27
 * @version: 1.0.0
 * @description:
 */
public class CovariantReturn {
}

// 粮食
class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}

// 小麦
class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

// 磨
class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    @Override
    Wheat process() {
        return new Wheat(); // 返回Grain的子类
    }
}
