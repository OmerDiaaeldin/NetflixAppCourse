package aui.netflixapp.SeriesMovies;

import aui.netflixapp.shows.Genres;
import aui.netflixapp.shows.Languages;
import aui.netflixapp.shows.MaturityLevel;
import aui.netflixapp.shows.Show;
import aui.netflixapp.subscriptionPlan.Quality;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Movie extends Show {
    private int duration;

    public Movie(int duration, String title, GregorianCalendar release_date, Quality quality, ArrayList<Genres> genres, Languages language, ArrayList<String> names, int num_views, String synopsis, double average_rating, MaturityLevel level, int total_watch) {
        super(title, release_date, quality, genres, language, names, num_views, synopsis, average_rating, level, total_watch);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}';
    }
}
