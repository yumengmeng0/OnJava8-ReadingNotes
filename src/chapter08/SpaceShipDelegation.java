package chapter08;

import java.lang.ref.PhantomReference;

/**
 * @author: ymm
 * @date: 2022/8/25
 * @version: 1.0.0
 * @description: 委托
 *              Idea自动生成委托对象的方法：
 *              选中代理对象 -> alt + insert（Generate...） -> Delegation method...
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void back(int velocity) {
        controls.back(velocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA protector");
        protector.forward(100);
    }
}
