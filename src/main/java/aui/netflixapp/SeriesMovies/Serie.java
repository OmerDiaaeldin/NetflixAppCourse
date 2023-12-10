package aui.netflixapp.SeriesMovies;

import aui.netflixapp.shows.Genres;
import aui.netflixapp.shows.Languages;
import aui.netflixapp.shows.MaturityLevel;
import aui.netflixapp.shows.Show;
import aui.netflixapp.subscriptionPlan.Quality;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Serie extends Show {
    private int seasons;
    private ArrayList<Integer> episodes;

    public Serie(int seasons, ArrayList<Integer> episodes, String title, GregorianCalendar release_date, Quality quality, ArrayList<Genres> genres, Languages language, ArrayList<String> names, int num_views, String synopsis, double average_rating, MaturityLevel level, int total_watch) {
        super(title, release_date, quality, genres, language, names, num_views, synopsis, average_rating, level, total_watch);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public ArrayList<Integer> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<Integer> episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "seasons=" + seasons +
                ", episodes=" + episodes +
                '}';
    }
}
