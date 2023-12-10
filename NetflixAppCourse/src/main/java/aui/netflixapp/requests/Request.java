/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.requests;

import aui.netflixapp.customers.Account;
import java.util.GregorianCalendar;
/**
 *
 * @author odaio
 */
public class Request {

    protected Account account1;
    protected GregorianCalendar date;
    protected String titleSuggestion;

    public Request(Account account1, GregorianCalendar date, String titleSuggestion) {
        this.account1 = account1;
        this.date = date;
        this.titleSuggestion = titleSuggestion;
    }

    public Account getAccount1() {
        return account1;
    }

    public void setAccount1(Account account1) {
        this.account1 = account1;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getTitleSuggestion() {
        return titleSuggestion;
    }

    public void setTitleSuggestion(String titleSuggestion) {
        this.titleSuggestion = titleSuggestion;
    }

    @Override
    public String toString() {
        return "Request{" + "account1=" + account1 + ", date=" + date + ", titleSuggestion=" + titleSuggestion + '}';
    }
    
    
}
