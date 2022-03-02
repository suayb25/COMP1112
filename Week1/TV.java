/**
 * @author talha
 */

//https://www.tutorialspoint.com/object_oriented_analysis_design/ooad_uml_basic_notation.htm
public class TV {
    private int channel = 1;
    private int volumeLevel = 0;
    private boolean on = false;

    public TV() {
    }

    public TV(int favoriteChan) {
        this.channel = favoriteChan;
    }

    public void turnOn() {
        this.on = true;

    }

    public void turnOff() {
        this.on = false;
    }

    public void power() { //Instead of turnOff or turnOn we can use power function.
        if (this.on == true) {
            this.on = false;
        } else {
            this.on = true;
        }
    }

    public void setChannel(int chNo) {
        if (chNo >= 0 || chNo <= 120) {
            this.channel = chNo;
        }
    }

    public void setVolume(int vol) {
        if (vol >= 0 || vol <= 6) {
            this.volumeLevel = vol;
        }
    }

    public void volumeUp() {
        if (this.volumeLevel <= 6) {
            this.volumeLevel++;
        } else {
            System.out.println("You can not up the volume. Volume has the maximum value (7)");
        }
    }

    public void volumeDown() {
        if (this.volumeLevel >= 1) {
            this.volumeLevel--;
        } else {
            System.out.println("You can not down the volume. Volume has the minimum value (0).");
        }

    }

    public void channelUp() {
        if (this.channel <= 119) {
            this.channel++;
        } else {
            System.out.println("You can not up the channel. Channel has the maximum value (120)");
        }
    }

    public void channelDown() {
        if (this.channel >= 1) {
            this.channel--;
        } else {
            System.out.println("You can not down the channel. Channel has the minimum value (0).");
        }
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }
}
