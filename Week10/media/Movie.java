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
public class Movie extends Media {

    private String subTitle;
    private String director;
    private int year;

    public Movie(String title, int length, String subTitle, String director, int year) {
        super(title, length);
        this.subTitle = subTitle;
        this.director = director;
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void play() {
        System.out.println("Play of MOVIE");
    }

    @Override
    public void pause() {
        System.out.println("Pause of MOVIE");
    }

    @Override
    public void stop() {
        System.out.println("Stop of MOVIE");
    }

    @Override
    public void Backward() {
        System.out.println("Backward of MOVIE");
    }

    @Override
    public void FastForward() {
        System.out.println("FastForward of MOVIE");
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals of MOVIE");
        if (obj instanceof Movie) {
            Movie m = (Movie) obj;
            if (super.equals(m) && this.subTitle.equals(m.subTitle) && this.director.equals(m.director) && this.year == m.year) {
                return true;
            }
        }
        return false;
    }
}
