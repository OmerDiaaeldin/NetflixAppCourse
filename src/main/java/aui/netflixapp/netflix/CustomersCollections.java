/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.netflix;

import aui.netflixapp.customers.Account;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

/**
 *
 * @author odaio
 */
public class CustomersCollections {
    protected ArrayList<Account> customers;
    
    public CustomersCollections(ArrayList<Account> customers){
        this.customers = customers;
    }
    
    public ArrayList<Account> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Account> customers) {
        this.customers = customers;
    }
    
    public void register(String email, String password) {
        customers.add(new Account(email, password)); 
    }
    
    public void addAccount(Account account) {
    // Add a new account to the list of customers
    this.customers.add(account);
    System.out.println("Added a new account.");
}

    public void removeAccount(Account account) {
        this.customers.remove(account);
    }

    public void editAccount(String email, Account newAccount) {
        ListIterator<Account> iter = this.customers.listIterator();
        while (iter.hasNext()) {
            Account account = iter.next();
            if (account.getEmail().equals(email)) {
                iter.set(newAccount);
            }
        }
}
    public ArrayList<Account> searchAccount(String email) {
        ListIterator<Account> iter = this.customers.listIterator();
        ArrayList<Account> results = new ArrayList<>();

        while (iter.hasNext()) {
            Account account = iter.next();
            if (account.getEmail().equals(email)) {
                results.add(account);
            }
        }
        return results;
}
    public void sortcustomers() {
    Collections.sort(this.customers);
}

    public void sortcustomersDescending() {
        Collections.sort(this.customers, Collections.reverseOrder());
    }

    public void sortcustomers(Comparator<Account> comp) {
        Collections.sort(this.customers, comp);
    }

    public boolean findAccount(Account account) {
        Collections.sort(this.customers);
        int index = Collections.binarySearch(this.customers, account);
        return index >= 0;
    }

    public void findAccount(Account account, Comparator<Account> comp) {
        Collections.sort(this.customers, comp);
        int index = Collections.binarySearch(this.customers, account, comp);
        if (index >= 0) {
            System.out.println("Account found!");
        } else {
            System.out.println("Account not found.");
        }
    }
    
}
