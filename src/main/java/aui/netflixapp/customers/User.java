/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.customers;


import aui.netflixapp.payment.PaymentMethod;
import aui.netflixapp.subscriptionPlan.Subscription;
import aui.netflixapp.requests.Request;
import java.util.ArrayList;
/**
 *
 * @author odaio
 */
public class User {
    protected String phone;
    protected ArrayList<Profile> profile;
    protected ArrayList<Request> requests;
    protected PaymentMethod pay_method;
    protected Subscription subcription;

    public User(String phone, ArrayList<Profile> profile, ArrayList<Request> requests, PaymentMethod pay_method, Subscription subcription) {
        this.phone = phone;
        this.profile = profile;
        this.requests = requests;
        this.pay_method = pay_method;
        this.subcription = subcription;
    }
    
    public void view_prof_history() {
        
    }
    
    public void download_hist() {
        
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Profile> getProfile() {
        return profile;
    }

    public void setProfile(ArrayList<Profile> profile) {
        this.profile = profile;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    public PaymentMethod getPay_method() {
        return pay_method;
    }

    public void setPay_method(PaymentMethod pay_method) {
        this.pay_method = pay_method;
    }

    public Subscription getSubcription() {
        return subcription;
    }

    public void setSubcription(Subscription subcription) {
        this.subcription = subcription;
    }

    @Override
    public String toString() {
        return "User{" + "phone=" + phone + ", profile=" + profile + ", requests=" + requests + ", pay_method=" + pay_method + ", subcription=" + subcription + '}';
    }
    
    
}
