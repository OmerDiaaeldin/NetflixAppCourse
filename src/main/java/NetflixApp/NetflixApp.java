/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetflixApp;


import aui.netflixapp.netflix.Netflix;
import aui.netflixapp.shows.*;
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

        Show breakingBad = new Show(
            "Breaking Bad",
            new GregorianCalendar(2008, 0, 20),
            Quality.HD,
            new Genres[]{Genres.DRAMA, Genres.CRIME},
            Languages.ENGLISH,
            new String[]{"Bryan Cranston", "Aaron Paul"},
            0,
            "High school chemistry teacher turned methamphetamine kingpin.",
            9.5,
            new MaturityLevel(18, "Morally ambiguous show has crime, drugs, Latino stereotypes."),
            0
        );

        netflix.addShow(breakingBad);
        
        System.out.println("State of 'Breaking Bad' show:");
        System.out.println(breakingBad.toString());

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