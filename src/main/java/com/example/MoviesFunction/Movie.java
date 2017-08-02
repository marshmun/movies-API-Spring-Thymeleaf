package com.example.MoviesFunction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


    @JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    String title;
    String posterPath; //(You will need to annotate this with @JsonProperty to make it match to poster_path)
    String overview;
    double popularity;

    public Movie() {
    }

    public Movie(String title, String posterPath, String overview, double popularity) {

        this.title = title;
        this.posterPath = posterPath;
        this.overview = overview;
        this.popularity = popularity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }
}
