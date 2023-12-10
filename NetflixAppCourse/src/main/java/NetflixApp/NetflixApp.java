/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetflixApp;


import aui.netflixapp.netflix.Netflix;
import aui.netflixapp.shows.*;
import aui.netflixapp.SeriesMovies.*;
import aui.netflixapp.subscriptionPlan.Quality;
import aui.netflixapp.customers.Account;
import aui.netflixapp.requests.Request;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class NetflixApp {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        ArrayList<Show> shows = new ArrayList<>();
        ArrayList<Account> customers = new ArrayList<>();
        ArrayList<Request> requests = new ArrayList<>();

        Netflix netflix = new Netflix(shows, customers, requests);

                Movie inception = new Movie(
                148, // duration in minutes
                "Inception",
                new GregorianCalendar(2010, 6, 16),
                Quality.HD,
                new Genres[]{Genres.ACTION, Genres.SCIENCE_FICTION},
                Languages.ENGLISH,
                new String[]{"Leonardo DiCaprio", "Joseph Gordon-Levitt"},
                0,
                "A thief enters the dreams of others to steal their secrets.",
                8.8,
                new MaturityLevel(13, "Mind-bending thriller with action and sci-fi elements."),
                0
        );

        Serie strangerThings = new Serie(
                4, // seasons
                new int[]{8, 9, 8, 9}, // episodes per season
                "Stranger Things",
                new GregorianCalendar(2016, 6, 15),
                Quality.HD,
                new Genres[]{Genres.DRAMA, Genres.FANTASY},
                Languages.ENGLISH,
                new String[]{"Millie Bobby Brown", "Winona Ryder"},
                0,
                "A group of kids in a small town uncover a series of supernatural mysteries.",
                8.7,
                new MaturityLevel(14, "Mild violence, suspense, and supernatural elements."),
                0
        );

        netflix.addShow(inception);
        netflix.addShow(strangerThings);
        
        System.out.println("State of 'Breaking Bad' show:");
        System.out.println("Netflix Shows:");
        for (Show show : netflix.getShows()) {
            System.out.println(show.toString());
        }

        System.out.println("You must have an account in order to access NetflixApp. Press 1 to sign up:");
        int choice = myObj.nextInt();

        if (choice == 1) {
            myObj.nextLine();

            System.out.println("Please enter a valid Email Address:");
            String email = myObj.nextLine();
            System.out.println("Please enter a password:");
            String password = myObj.nextLine();

            netflix.register(email, password);
            System.out.println("State of the user account:");
            System.out.println(customers.get(0).toString()); // Assuming only one user account for simplicity

            System.out.println("Enter the name of the show:");
            String searchQuery = myObj.nextLine();
            netflix.search(searchQuery);

            System.out.println("Browsing Netflix shows:");
            netflix.browse();
        } else {
            System.out.println("You must sign up to access NetflixApp. Goodbye!");
        }
    }
}