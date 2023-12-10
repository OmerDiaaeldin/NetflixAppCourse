/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.netflix;


import java.util.ArrayList;
import aui.netflixapp.shows.Show;
import aui.netflixapp.customers.Account;
import aui.netflixapp.requests.Request;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author odaio
 */
public class Netflix {
    protected ArrayList<Show> shows;
    protected ArrayList<Account> customers;
    protected ArrayList<Request> requests;

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
        
        if (shows.isEmpty()) {
            System.out.println("No shows found.");
        } else {
            System.out.println("Currently available shows on Netflix:");
            for (Show show : shows) {
                System.out.println(show.getTitle());
            }
        }
        
    }

    public void addShow(Show show) {
        // Add a new show to the list of shows
        shows.add(show);
        System.out.println("Added a new show to Netflix.");
    }
    
    public void removeShow(Show show) {
        shows.remove(show);
    }

    public void editShow(String title, Show new_show) {
        ListIterator<Show> iter = shows.listIterator();
        while (iter.hasNext()) {
            Show show = iter.next();
            if (show.getTitle().equals(title)) {
                iter.set(new_show);
            }
        }
    }

    public ArrayList<Show> search(double rating) {
        ListIterator<Show> iter = shows.listIterator();
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
        Collections.sort(shows);
    }
    
    public void sortShowsDescending() {
        Collections.sort(shows, Collections.reverseOrder());
    }

    public void sortShows(Comparator<Show> comp) {
        Collections.sort(shows, comp);

    }

    public boolean findShow(Show show) {
        Collections.sort(shows);
        int index = Collections.binarySearch(shows, show);
        return index >= 0;
    }

    public void findShow(Show show, Comparator<Show> comp) {
        Collections.sort(shows, comp);
        int index = Collections.binarySearch(shows, show, comp);
        if (index >= 0) {
            System.out.println("Show found!");
        } else {
            System.out.println("Show not found.");
        }
    }
    
    
    ////////////////////////////////////////////////////////
    public void addAccount(Account account) {
    // Add a new account to the list of customers
    customers.add(account);
    System.out.println("Added a new account.");
}

public void removeAccount(Account account) {
    customers.remove(account);
}

public void editAccount(String username, Account newAccount) {
    ListIterator<Account> iter = customers.listIterator();
    while (iter.hasNext()) {
        Account account = iter.next();
        if (account.getUsername().equals(username)) {
            iter.set(newAccount);
        }
    }
}

public ArrayList<Account> search(double balance) {
    ListIterator<Account> iter = customers.listIterator();
    ArrayList<Account> results = new ArrayList<>();

    while (iter.hasNext()) {
        Account account = iter.next();
        if (account.getBalance() >= balance) {
            results.add(account);
        }
    }
    return results;
}

public void sortcustomers() {
    Collections.sort(customers);
}

public void sortcustomersDescending() {
    Collections.sort(customers, Collections.reverseOrder());
}

public void sortcustomers(Comparator<Account> comp) {
    Collections.sort(customers, comp);
}

public boolean findAccount(Account account) {
    Collections.sort(customers);
    int index = Collections.binarySearch(customers, account);
    return index >= 0;
}

public void findAccount(Account account, Comparator<Account> comp) {
    Collections.sort(customers, comp);
    int index = Collections.binarySearch(customers, account, comp);
    if (index >= 0) {
        System.out.println("Account found!");
    } else {
        System.out.println("Account not found.");
    }
}

    ///////////////////////////////////////

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
