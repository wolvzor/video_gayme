package com.wolviegames.videogayme.twitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TwitterController {
    @Autowired
    private TwitterService twitterService;

    @Autowired
    private TwitterTemplateCreator twitterTemplateCreator;

    @RequestMapping(method = RequestMethod.GET)
    public String tweet(Model model) {
        Twitter twitterTemplate = twitterTemplateCreator.getTwitterTemplate();
        twitterService.tweet(twitterTemplate, "It's like hello world, but with video games, a Hayley Kiyoko " +
                "soundtrack, and figuring out who pays at dates.");
        return "tweet";
    }

}
