/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.netflix;


import aui.netflixapp.shows.Show;
import aui.netflixapp.customers.Account;
import aui.netflixapp.requests.Request;
/**
 *
 * @author odaio
 */
public class Netflix {
    private Show[] shows;
    private Account[] customers;
    private Request[] requests;

    public Netflix(Show[] shows, Account[] customers, Request[] requests) {
        this.shows = shows;
        this.customers = customers;
        this.requests = requests;
    }    
    
    public void register() {
        
    }
    public void search() {
        
    }
    public void browse() {
        
    }
    public void addShow() {
        
    }

    public Show[] getShows() {
        return shows;
    }

    public void setShows(Show[] shows) {
        this.shows = shows;
    }

    public Account[] getCustomers() {
        return customers;
    }

    public void setCustomers(Account[] customers) {
        this.customers = customers;
    }

    public Request[] getRequests() {
        return requests;
    }

    public void setRequests(Request[] requests) {
        this.requests = requests;
    }
    
    
}
