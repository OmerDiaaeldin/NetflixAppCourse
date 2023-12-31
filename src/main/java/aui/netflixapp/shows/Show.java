/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.shows;

/**
 *
 * @author odaio
 */
import java.util.ArrayList;
import java.util.GregorianCalendar;
import aui.netflixapp.subscriptionPlan.Quality;
import java.io.*;

public class Show implements Comparable<Show>, Serializable {
    private String title;
    private GregorianCalendar release_date;
    private Quality quality;
    private ArrayList<Genres> genres;
    private Languages language;
    private ArrayList<String> names;
    private int num_views;
    private String synopsis;
    private double average_rating;
    private MaturityLevel level;
    private int total_watch;

    public Show(String title, GregorianCalendar release_date, Quality quality, ArrayList<Genres> genres, Languages language, ArrayList<String> names, int num_views, String synopsis, double average_rating, MaturityLevel level, int total_watch) {
        this.title = title;
        this.release_date = release_date;
        this.quality = quality;
        this.genres = genres;
        this.language = language;
        this.names = names;
        this.num_views = num_views;
        this.synopsis = synopsis;
        this.average_rating = average_rating;
        this.level = level;
        this.total_watch = total_watch;
    }
    public Show(String title) {
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GregorianCalendar getRelease_date() {
        return release_date;
    }

    public void setRelease_date(GregorianCalendar release_date) {
        this.release_date = release_date;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public ArrayList<Genres> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genres> genres) {
        this.genres = genres;
    }

    public Languages getLanguage() {
        return language;
    }

    public void setLanguage(Languages language) {
        this.language = language;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public int getNum_views() {
        return num_views;
    }

    public void setNum_views(int num_views) {
        this.num_views = num_views;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }

    public MaturityLevel getLevel() {
        return level;
    }

    public void setLevel(MaturityLevel level) {
        this.level = level;
    }

    public int getTotal_watch() {
        return total_watch;
    }

    public void setTotal_watch(int total_watch) {
        this.total_watch = total_watch;
    }
    
    @Override
    public boolean equals(Object obj) {
        return (obj != null
                && obj instanceof Show
                && ((Show) obj).getTitle().equals(this.getTitle()));
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
    
    @Override
    public int compareTo(Show show) {
        return (this.title.compareTo(show.title));
    }

    @Override
    public String toString() {
        GregorianCalendar releaseDate = getRelease_date();
        int year = releaseDate.get(GregorianCalendar.YEAR);
        int month = releaseDate.get(GregorianCalendar.MONTH) + 1; // Months are zero-based, so add 1
        int day = releaseDate.get(GregorianCalendar.DAY_OF_MONTH);

        return "Show{" +
            "title='" + title + '\'' +
            ", release_date=" + year + "-" + month + "-" + day +
            ", quality=" + quality +
            ", genres=" + genres.toString() +
            ", language=" + language +
            ", names=" + names.toString() +
            ", num_views=" + num_views +
            ", synopsis='" + synopsis + '\'' +
            ", average_rating=" + average_rating +
            ", level=" + level +
            ", total_watch=" + total_watch +
            '}';
    }
    
}
