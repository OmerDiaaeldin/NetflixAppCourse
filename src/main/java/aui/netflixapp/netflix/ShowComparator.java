/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.netflix;

import aui.netflixapp.shows.Show;
import java.util.Comparator;

/**
 *
 * @author odaio
 */
public class ShowComparator implements Comparator<Show>{

    public int compare(Show show1, Show show2) {
        if (show1.getAverage_rating()> show2.getAverage_rating()) {
            return 1;
        }
        if (show1.getAverage_rating()> show2.getAverage_rating()) {
            return -1;
        }
        return 0;

    }
}
