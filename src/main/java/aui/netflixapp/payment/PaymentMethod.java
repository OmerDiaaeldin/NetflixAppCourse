/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.payment;

import java.util.GregorianCalendar;

/**
 *
 * @author odaio
 */
public class PaymentMethod {
    protected String holder_name;
    protected GregorianCalendar expiration;
    protected PaymentType type;
    protected int number;

    public PaymentMethod(String holder_name, GregorianCalendar expiration, PaymentType type, int number) {
        this.holder_name = holder_name;
        this.expiration = expiration;
        this.type = type;
        this.number = number;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public GregorianCalendar getExpiration() {
        return expiration;
    }

    public void setExpiration(GregorianCalendar expiration) {
        this.expiration = expiration;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" + "holder_name=" + holder_name + ", expiration=" + expiration + ", type=" + type + ", number=" + number + '}';
    }
    
    
}
