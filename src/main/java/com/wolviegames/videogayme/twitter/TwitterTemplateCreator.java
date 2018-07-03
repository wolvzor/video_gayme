package com.wolviegames.videogayme.twitter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Component;

@Component
public class TwitterTemplateCreator {
    @Autowired
    private Environment env;

    public Twitter getTwitterTemplate() {
        String consumerKey = env.getProperty("spring.social.twitter.appId");
        String consumerSecret = env.getProperty("spring.social.twitter.appSecret");
        String accessToken = env.getProperty("spring.social.twitter.accessToken");
        String accessTokenSecret = env.getProperty("spring.social.twitter.accessSecret");

        TwitterTemplate twitterTemplate = new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
        return twitterTemplate;
    }

}
