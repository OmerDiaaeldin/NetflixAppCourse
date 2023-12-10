/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.shows;

/**
 *
 * @author odaio
 */
import java.util.ArrayList;


public class MaturityRating {
    protected ArrayList<String> rating_reason;

    public MaturityRating(ArrayList<String> rating_reason) {
        this.rating_reason = rating_reason;
    }

    public ArrayList<String> getRating_reason() {
        return rating_reason;
    }

    public void setRating_reason(ArrayList<String> rating_reason) {
        this.rating_reason = rating_reason;
    }

    @Override
    public String toString() {
        return "MaturityRating{" + "rating_reason=" + rating_reason + '}';
    }
    
    
}
