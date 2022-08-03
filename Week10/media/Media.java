/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author talha
 */
public abstract class Media {

    protected String title;
    protected int length;
    protected int curPosition;

    public Media(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public void play() {
        System.out.println("Play of MEDIA");
    }

    public void pause() {
        System.out.println("Pause of MEDIA");
    }

    public void stop() {
        System.out.println("Stop of MEDIA");
    }

    public void Backward() {
        System.out.println("Backward of MEDIA");
    }

    public void FastForward() {
        System.out.println("FastForward of MEDIA");
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals of MEDIA");
        if (o instanceof Media) {
            Media m = (Media) o;
            if (this.title.equals(m.title) && this.length == m.length) {
                return true;
            }
        }
        return false;
    }
}
