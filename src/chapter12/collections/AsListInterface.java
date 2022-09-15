package chapter12.collections;

import java.util.*;

/**
 * @author: ymm
 * @date: 2022/9/1
 * @version: 1.0.0
 * @description:
 */
public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
//        snow1.add(new Heavy()); // 异常
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
//        snow2.add(new Slush()); // 异常
        Collection<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy());
        snow3.add(new Crusty());

        // 以显示类型参数说明作为提示
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy(), new Slush());
//        snow4.add(new Powder()); //异常
    }

}

class Snow {
}

// 粉末 粉末（状）雪
class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

// 硬壳,crusty snow层雪
class Crusty extends Snow {

}

// 雪泥
class Slush extends Snow {

}