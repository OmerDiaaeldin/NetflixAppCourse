/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.netflix;

import aui.netflixapp.shows.Show;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

/**
 *
 * @author odaio
 */
public class ShowCollections {
    protected ArrayList<Show> shows;
    
    public ShowCollections(ArrayList<Show> shows){
        this.shows = shows;
    }
    
    public ArrayList<Show> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }
    
    public void browse() {
        
        if (this.shows.isEmpty()) {
            System.out.println("No shows found.");
        } else {
            System.out.println("Currently available shows on Netflix:");
            for (Show show : this.shows) {
                System.out.println(show.getTitle());
            }
        }
        
    }
    
    public void search(String query) {
        System.out.println("Searching for: " + query);

        ArrayList<Show> matchingShows = new ArrayList<>();

        for (Show show : this.shows) {
            if (show.getTitle().toLowerCase().contains(query.toLowerCase())) {
                matchingShows.add(show);
            }
        }

        if (matchingShows.isEmpty()) {
            System.out.println("No matching shows found.");
        } else {
            System.out.println("Matching shows:");
            for (Show show : matchingShows) {
                System.out.println(show.getTitle());
            }
        }
    }

    public void addShow(Show show) {
        // Add a new show to the list of shows
        this.shows.add(show);
        System.out.println("Added a new show to Netflix.");
    }
    
    public void removeShow(Show show) {
        this.shows.remove(show);
    }

    public void editShow(String title, Show new_show) {
        ListIterator<Show> iter = this.shows.listIterator();
        while (iter.hasNext()) {
            Show show = iter.next();
            if (show.getTitle().equals(title)) {
                iter.set(new_show);
            }
        }
    }

    public ArrayList<Show> searchShow(double rating) {
        ListIterator<Show> iter = this.shows.listIterator();
        ArrayList<Show> results = new ArrayList<>();

        while (iter.hasNext()) {
            Show show = iter.next();
            if (show.getAverage_rating() >= rating) {
                results.add(show);
            }
        }
        return results;
    }

    public void sortShows(){
        Collections.sort(this.shows);
    }
    
    public void sortShowsDescending() {
        Collections.sort(this.shows, Collections.reverseOrder());
    }

    public void sortShows(Comparator<Show> comp) {
        Collections.sort(this.shows, comp);

    }

    public boolean findShow(Show show) {
        Collections.sort(this.shows);
        int index = Collections.binarySearch(this.shows, show);
        return index >= 0;
    }

    public void findShow(Show show, Comparator<Show> comp) {
        Collections.sort(this.shows, comp);
        int index = Collections.binarySearch(this.shows, show, comp);
        if (index >= 0) {
            System.out.println("Show found!");
        } else {
            System.out.println("Show not found.");
        }
    }
    
    public void saveMovies() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/netflixy.ser"))) {
            oos.writeObject(shows);
            System.out.println("Movies saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving movies: " + e.getMessage());
        }
    }
    
    public void loadMovies() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/netflixy.ser"))) {
            shows = (ArrayList<Show>) ois.readObject();
            System.out.println("Movies loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading movies: " + e.getMessage());
        }
    }   
    
}
