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
import java.io.*;
/**
 *
 * @author odaio
 */

public class Netflix{
    private ShowCollections shows;
    private CustomersCollections customers;
    private RequestCollections requests;

    public Netflix(ArrayList<Show> shows, ArrayList<Account> customers, ArrayList<Request> requests) {
        this.shows = new ShowCollections(shows);
        this.customers = new CustomersCollections(customers);
        this.requests = new RequestCollections(requests);
    }

    public ShowCollections getShows() {
        return shows;
    }

    public void setShows(ShowCollections shows) {
        this.shows = shows;
    }

    public CustomersCollections getCustomers() {
        return customers;
    }

    public void setCustomers(CustomersCollections customers) {
        this.customers = customers;
    }

    public RequestCollections getRequests() {
        return requests;
    }

    public void setRequests(RequestCollections requests) {
        this.requests = requests;
    }
    
    @Override
    public String toString() {
        return "Netflix{" + "shows=" + shows + ", customers=" + customers + ", requests=" + requests + '}';
    }
}
