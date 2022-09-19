package chapter13.functional;

/**
 * @author YuMengMeng
 * @date 2022/9/16
 */
interface Strategy {
    String approach(String msg);
}

class Soft implements Strategy {

    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

class Unrelated {
    static String twice(String msg) {
        return msg + " " + msg;
    }
}

public class Strategize {
    Strategy strategy;
    String msg;

    public Strategize(String msg) {
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                // lambda表达式
                msg -> msg.substring(0, 5),
                // 方法引用
                Unrelated::twice
        };

        Strategize strategize = new Strategize("Hello there");
        strategize.communicate();

        for (Strategy strategy : strategies) {
            strategize.changeStrategy(strategy);
            strategize.communicate();
        }
    }
}
