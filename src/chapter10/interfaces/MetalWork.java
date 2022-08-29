package chapter10.interfaces;

import onjava.Operation;

/**
 * @author: ymm
 * @date: 2022/8/28
 * @version: 1.0.0
 * @description:
 */
// metalwork 金属制品的制造(或加工); 金属制品; 金属配件
public class MetalWork {
    public static void main(String[] args) {
        Operation twist = new Operation() {

            @Override
            public void execute() {
                Operation.show("Twist");
            }
        };

        Operation.runOps(
                new Heat(),
                new Operation() { // Anonymous new Operation() can be replaced with lambda
                    @Override
                    public void execute() {
                        Operation.show("Hammer");
                    }
                },
                twist::execute,
                () -> Operation.show("Anneal")
        );
    }
}

class Heat implements Operation {

    @Override
    public void execute() {
        Operation.show("Heat");
    }
}