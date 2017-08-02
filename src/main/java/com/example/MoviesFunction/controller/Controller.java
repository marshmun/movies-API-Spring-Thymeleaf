package com.example.MoviesFunction.controller;

import com.example.MoviesFunction.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import java.util.List;

@RestController
public class Controller {

    static final String API_URL= "https://api.themoviedb.org/3/movie/now_playing?api_key=be2a38521a7859c95e2d73c48786e4bb\n" +
            "\n";

    public static List<Movie> getMovies(String route) {
        RestTemplate restTemplate = new RestTemplate().getForObject(API_URL, Movie.class);
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/nowPlaying")
    public String nowPlaying(){
        getMovies("now")
        return "now-playing";

    }

    @RequestMapping("/overviewMashup")
    public String overviewMashup () {
        return "overview-mashup";

    }

    @RequestMapping("/mediumLong")
    public String mediumLong () {
        return "medium-popular-long-name";
    }

}
