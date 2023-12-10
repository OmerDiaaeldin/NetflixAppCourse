/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.shows;

import java.util.GregorianCalendar;

/**
 *
 * @author odaio
 */
public class Viewing {

    protected GregorianCalendar date;
    protected Show show;
    protected int rating;

    public Viewing(GregorianCalendar date, Show show, int rating) {
        this.date = date;
        this.show = show;
        this.rating = rating;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Viewing{" + "date=" + date + ", show=" + show + ", rating=" + rating + '}';
    }

}
