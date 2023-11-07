/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.netflix;


import java.util.ArrayList;
import aui.netflixapp.shows.Show;
import aui.netflixapp.customers.Account;
import aui.netflixapp.requests.Request;
/**
 *
 * @author odaio
 */
public class Netflix {
    private ArrayList<Show> shows;
    private ArrayList<Account> customers;
    private ArrayList<Request> requests;

    public Netflix(ArrayList<Show> shows, ArrayList<Account> customers, ArrayList<Request> requests) {
        this.shows = shows;
        this.customers = customers;
        this.requests = requests;
    }    
    
    public void register(String email, String password) {
        customers.add(new Account(email, password)); 
    }
    
    public void search(String query) {
        System.out.println("Searching for: " + query);

        ArrayList<Show> matchingShows = new ArrayList<>();

        for (Show show : shows) {
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

    public void browse() {
        // Implement the browsing functionality here
        System.out.println("Browsing Netflix shows");
        // Display a list of available shows for browsing
    }

    public void addShow(Show show) {
        // Add a new show to the list of shows
        shows.add(show);
        System.out.println("Added a new show to Netflix.");
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Show> shows) {
        this.shows = shows;
    }

    public ArrayList<Account> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Account> customers) {
        this.customers = customers;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }



    @Override
    public String toString() {
        return "Netflix{" + "shows=" + shows + ", customers=" + customers + ", requests=" + requests + '}';
    }
}
