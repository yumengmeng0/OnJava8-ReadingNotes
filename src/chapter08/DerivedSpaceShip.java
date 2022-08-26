package chapter08;

/**
 * @author: ymm
 * @date: 2022/8/25
 * @version: 1.0.0
 * @description:
 */
public class DerivedSpaceShip extends SpaceShipControls {
    private String name;

    public DerivedSpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DerivedSpaceShip{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        DerivedSpaceShip protector = new DerivedSpaceShip("NSEA protector");
        protector.forward(100);
    }
}
