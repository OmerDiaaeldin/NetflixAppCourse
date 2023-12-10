package NetflixApp;

import aui.netflixapp.netflix.Netflix;
import aui.netflixapp.shows.*;
import aui.netflixapp.customers.Account;
import aui.netflixapp.requests.Request;

import java.util.ArrayList;
import java.util.Scanner;

public class NetflixApp {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        ArrayList<Show> shows = new ArrayList<>();
        ArrayList<Account> customers = new ArrayList<>();
        ArrayList<Request> requests = new ArrayList<>();

        Netflix netflix = new Netflix(shows, customers, requests);
        
        netflix.loadMovies();

        int userChoice;
        do {
            System.out.println("\n===== Netflix Menu =====");
            System.out.println("1. Search");
            System.out.println("2. Browse");
            System.out.println("3. Add Show");
            System.out.println("4. Leave");
            System.out.println("=========================");
            System.out.print("Enter your choice: ");
            userChoice = myObj.nextInt();
            myObj.nextLine(); // Consume the newline character

            switch (userChoice) {
                case 1:
                    System.out.println("Enter the name of the show to search:");
                    String searchQuery = myObj.nextLine();
                    netflix.search(searchQuery);
                    break;
                case 2:
                    System.out.println("Browsing Netflix shows:");
                    netflix.browse();
                    break;
                case 3:
                    System.out.println("Enter the title of the show:");
                    String title = myObj.nextLine();
                    Show newShow = new Show(title);
                    netflix.addShow(newShow);
                    // Serialization of list of showe
                    netflix.saveMovies();
                    break;
                case 4:
                    netflix.saveMovies();
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (userChoice != 4);
    }
}
