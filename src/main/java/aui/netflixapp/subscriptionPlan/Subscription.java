/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.subscriptionPlan;

/**
 *
 * @author odaio
 */

import java.util.GregorianCalendar;

public class Subscription {
    private GregorianCalendar subscribed;    
    private Plan current_plan;
    private GregorianCalendar canceled;
    private String cancel_reason;

    public Subscription(GregorianCalendar subscribed, Plan current_plan, GregorianCalendar canceled, String cancel_reason) {
        this.subscribed = subscribed;
        this.current_plan = current_plan;
        this.canceled = canceled;
        this.cancel_reason = cancel_reason;
    }

    public GregorianCalendar getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(GregorianCalendar subscribed) {
        this.subscribed = subscribed;
    }

    public Plan getCurrent_plan() {
        return current_plan;
    }

    public void setCurrent_plan(Plan current_plan) {
        this.current_plan = current_plan;
    }

    public GregorianCalendar getCanceled() {
        return canceled;
    }

    public void setCanceled(GregorianCalendar canceled) {
        this.canceled = canceled;
    }

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }
            
    public void change_plan(Plan new_plan) {
        setCurrent_plan(new_plan);
    }
    
    public void billing_by_month () {
        System.out.println("Billed for the monthly cost of: " + this.current_plan.getCost());
    }
    
    public void cancel(String cancel_reason, GregorianCalendar date) {
        setCancel_reason(cancel_reason);
        setCanceled(new GregorianCalendar());
    }
    
    
    @Override
    public String toString() {
        return "Subscription{" + "subscribed=" + subscribed + ", current_plan=" + current_plan + ", canceled=" + canceled + ", cancel_reason=" + cancel_reason + '}';
    }
}
