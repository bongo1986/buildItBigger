package com.jokes;

import java.util.Random;

/**
 * Created by Greg on 23-06-2016.
 */
public class JokesTeller {
    private String[] jokes = {
            "First joke",
            "Second joke",
            "Third joke"
    };

    public String tellJoke(){
        Random ran = new Random();
        int x = ran.nextInt(jokes.length);
        return jokes[x];
    }


}
