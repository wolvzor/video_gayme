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
        String actor = resourceLoader.actors.get(rand.nextInt(resourceLoader.actors.size()));
        String gayThing = resourceLoader.gayThings.get(rand.nextInt(resourceLoader.gayThings.size()));

        return "It's like " + videoGame + ", but with " + actor + " and " + gayThing;
    }

}
