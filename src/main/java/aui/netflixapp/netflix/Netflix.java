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
public class Netflix{
    public ShowCollections shows;
    public CustomersCollections customers;
    public RequestCollections requests;

    public Netflix(ArrayList<Show> shows, ArrayList<Account> customers, ArrayList<Request> requests) {
        this.shows = new ShowCollections(shows);
        this.customers = new CustomersCollections(customers);
        this.requests = new RequestCollections(requests);
    }    
    
    @Override
    public String toString() {
        return "Netflix{" + "shows=" + shows + ", customers=" + customers + ", requests=" + requests + '}';
    }
}
