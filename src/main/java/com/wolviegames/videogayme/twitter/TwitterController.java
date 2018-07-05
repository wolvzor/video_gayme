package com.wolviegames.videogayme.twitter;

import com.wolviegames.videogayme.gayme.GaymeFabricator;
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

    @Autowired
    private GaymeFabricator gaymeFabricator;

    @RequestMapping(method = RequestMethod.GET)
    public String tweet(Model model) {
        Twitter twitterTemplate = twitterTemplateCreator.getTwitterTemplate();
        String tweet = gaymeFabricator.fabricateTweet();
        twitterService.tweet(twitterTemplate, tweet);
        return "tweet";
    }

}
