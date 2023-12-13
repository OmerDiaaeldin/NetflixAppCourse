/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.netflix;
import aui.netflixapp.requests.Request;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

/**
 *
 * @author odaio
 */
public class RequestCollections {
    public ArrayList<Request> requests;

    public RequestCollections(ArrayList<Request> requests) {
        this.requests = requests;
    }
    
    public ArrayList<Request> getRequests() {
        return requests;
    }
    

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }
    
    // requests methods
    public void addRequest(Request request) {
        // Add a new request to the list of requests
        this.requests.add(request);
        System.out.println("Added a new request.");
    }

    public void removeRequest(Request request) {
        this.requests.remove(request);
    }

    public void editRequest(String titleSuggestion, Request newRequest) {
        ListIterator<Request> iter = this.requests.listIterator();
        while (iter.hasNext()) {
            Request request = iter.next();
            if (request.getTitleSuggestion().equals(titleSuggestion)) {
                iter.set(newRequest);
            }
        }
    }

    public ArrayList<Request> searchRequest(String titleSuggestion) {
        ListIterator<Request> iter = this.requests.listIterator();
        ArrayList<Request> results = new ArrayList<>();

        while (iter.hasNext()) {
            Request request = iter.next();
            if (request.getTitleSuggestion().equals(titleSuggestion)) {
                results.add(request);
            }
        }
        return results;
    }

    public void sortRequests() {
        Collections.sort(this.requests);
    }

    public void sortRequestsDescending() {
        Collections.sort(this.requests, Collections.reverseOrder());
    }

    public void sortRequests(Comparator<Request> comp) {
        Collections.sort(this.requests, comp);
    }

    public boolean findRequest(Request request) {
        Collections.sort(this.requests);
        int index = Collections.binarySearch(this.requests, request);
        return index >= 0;
    }

    public void findRequest(Request request, Comparator<Request> comp) {
        Collections.sort(this.requests, comp);
        int index = Collections.binarySearch(this.requests, request, comp);
        if (index >= 0) {
            System.out.println("Request found!");
        } else {
            System.out.println("Request not found.");
        }
    }    
}
