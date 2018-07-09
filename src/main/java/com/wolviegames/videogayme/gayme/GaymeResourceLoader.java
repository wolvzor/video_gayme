package com.wolviegames.videogayme.gayme;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource(ignoreResourceNotFound = true, value="classpath:gayme.properties")
public class GaymeResourceLoader {
    @Value("#{'${gayme.videogames}'.split(',')}")
    List<String> videoGames;

    @Value("#{'${gayme.people}'.split(',')}")
    List<String> people;

    @Value("#{'${gayme.gaythings}'.split(',')}")
    List<String> gayThings;
}
