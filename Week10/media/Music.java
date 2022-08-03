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
public class Music extends Media {

    private String singer;
    private String albumName;

    public Music(String title, int length, String singer, String albumName) {
        super(title, length);
        this.singer = singer;
        this.albumName = albumName;
    }

    public String getSinger() {
        return singer;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void Next() {
        System.out.println("Next of Music");
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals of MUSIC");
        if (obj instanceof Music) {
            Music m = (Music) obj;
            if (super.equals(m) && this.singer.equals(m.singer) && this.albumName.equals(m.albumName)) {
                return true;
            }
        }
        return false;
    }
}
