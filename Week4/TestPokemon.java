package com.company;

import java.util.ArrayList;
import java.util.Random;

public class TestPokemon {

    public static ArrayList<Pokemon> pokemons;

    public static void main(String[] args) {
        Location2D.setDimXY(100, 100);
        pokemons = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Pokemon p = new Pokemon(i + 3, i + 8);//just random numbers, prevent them being 0
            pokemons.add(p);
        }

        for (int i = 0; i < pokemons.size(); i++) { //for all pets
            if (new Random().nextBoolean()) {
                pokemons.get(i).feed();
            }
            if (new Random().nextBoolean()) {
                pokemons.get(i).move();
            }
            System.out.println(pokemons.get(i));
        }
        //We are running this example in the same day, so date is not so meaningful.
        //Think this code will be run on the server. User will request for move or feed their Pokemon.
    }
}
