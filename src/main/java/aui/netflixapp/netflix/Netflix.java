/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.netflix;


import java.util.ArrayList;
import aui.netflixapp.shows.Show;
import aui.netflixapp.customers.Account;
import aui.netflixapp.requests.Request;
import aui.netflixapp.subscriptionPlan.Quality;
import java.util.HashMap;
import aui.netflixapp.subscriptionPlan.Plan;
import aui.netflixapp.shows.MaturityLevel;
/**
 *
 * @author odaio
 */
public class Netflix{
    private ShowCollections shows;
    private CustomersCollections customers;
    private RequestCollections requests;
    private static final HashMap<String, Plan> plans_by_country = new HashMap<String, Plan>() {{
        put("Sudan", new Plan(100,4,4,Quality.FourK));
        put("Morocco", new Plan(100,4,4,Quality.FourK));
    }};
    private static final HashMap<String, MaturityLevel> maturity_by_region = new HashMap<String, MaturityLevel>() {{
        put("Sudan", new MaturityLevel(18,"Minimum legal age for being considered an adult is 18 in Sudan"));
        put("Morocco", new MaturityLevel(18,"Minimum legal age for being considered an adult is 18 in Morocco"));
    }};

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

    public static HashMap<String, Plan> getPlans_by_country() {
        return plans_by_country;
    }

    public static HashMap<String, MaturityLevel> getMaturity_by_region() {
        return maturity_by_region;
    }
    
    
    
    @Override
    public String toString() {
        return "Netflix{" + "shows=" + shows + ", customers=" + customers + ", requests=" + requests + '}';
    }
}
