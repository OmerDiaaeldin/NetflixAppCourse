package aui.netflixapp.customers;

import aui.netflixapp.payment.PaymentMethod;
import aui.netflixapp.subscriptionPlan.Subscription;
import aui.netflixapp.requests.Request;
import java.util.ArrayList;

public class User {
    protected String phone;
    protected ArrayList<Profile> profiles;
    protected ArrayList<Request> requests;
    protected PaymentMethod paymentMethod;
    protected Subscription subscription;

    public User(String phone, ArrayList<Profile> profiles, ArrayList<Request> requests, PaymentMethod paymentMethod, Subscription subscription) {
        this.phone = phone;
        this.profiles = profiles;
        this.requests = requests;
        this.paymentMethod = paymentMethod;
        this.subscription = subscription;
    }

    public void view_prof_history() {
        System.out.println("Your history has been displayed.");
    }

    public void download_hist() {
        System.out.println("Your history has been downloaded.");
    }

    // Other methods...

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "User{" +
                "phone='" + phone + '\'' +
                ", profiles=" + profiles +
                ", requests=" + requests +
                ", paymentMethod=" + paymentMethod +
                ", subscription=" + subscription +
                '}';
    }
}