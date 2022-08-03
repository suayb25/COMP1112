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
public class MediaPlayer {

    public static void main(String[] args) {
        Movie movie = new Movie("Dune", 180, "Part One", "Denis", 180);
        Music music = new Music("Koyver Kendini", 300, "Bedük", "On");
        movie.play();
        music.play();
        music.Next();
        System.out.println("-----------------");
        System.out.println(movie.equals(music));
        System.out.println(music.equals(movie));
    }
}
