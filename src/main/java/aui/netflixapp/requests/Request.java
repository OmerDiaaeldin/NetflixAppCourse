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

    private Account account1;
    private GregorianCalendar date;
    private String titleSuggestion;

    public Request(Account account1, GregorianCalendar date, String titleSuggestion) {
        this.account1 = account1;
        this.date = date;
        this.titleSuggestion = titleSuggestion;
    }
    
}
