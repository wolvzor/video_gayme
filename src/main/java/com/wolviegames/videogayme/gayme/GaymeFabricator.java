package com.wolviegames.videogayme.gayme;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GaymeFabricator {

    @Autowired
    GaymeResourceLoader resourceLoader;

    public String fabricateTweet() {
        Random rand = new Random();
        String videoGame = resourceLoader.videoGames.get(rand.nextInt(resourceLoader.videoGames.size()));
        String people = resourceLoader.people.get(rand.nextInt(resourceLoader.people.size()));
        String gayThing = resourceLoader.gayThings.get(rand.nextInt(resourceLoader.gayThings.size()));

        return "It's like " + videoGame + ", but with " + people + " and " + gayThing;
    }

}
