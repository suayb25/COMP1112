/**
 * @author talha
 */

public class testTv {

    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();
        System.out.println("For tv1:" + tv1);
        tv1.setChannel(9);
        tv1.setVolume(3);
        System.out.println("For tv2:" + tv2);
        tv2.turnOn();
        tv2.volumeUp();
        tv2.channelUp();
        System.out.println("For tv2:" + tv2);
        tv2.turnOff();
        System.out.println("For tv2:" + tv2);

        //Favorite channel example. Custom constructor is used.
        TV tv3 = new TV(5);
        System.out.println("For tv3:" + tv3);
    }

}
