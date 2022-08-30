package chapter11.innerclass;

/**
 * @author: ymm
 * @date: 2022/8/30
 * @version: 1.0.0
 * @description: 将一个类嵌入到某个作用域内
 */
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip { // 跟踪单
                private String id;

                public TrackingSlip(String id) {
                    this.id = id;
                }

                String getSlip() {
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("slip");
            String slip = ts.getSlip();
        }
    }

    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.track();
    }

}
