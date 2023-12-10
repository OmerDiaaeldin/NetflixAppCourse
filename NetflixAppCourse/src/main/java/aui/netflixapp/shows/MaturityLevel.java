/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.shows;

/**
 *
 * @author odaio
 */
public class MaturityLevel {
    protected int min_age;
    protected String description;

    public MaturityLevel(int min_age, String description) {
        this.min_age = min_age;
        this.description = description;
    }

    public int getMin_age() {
        return min_age;
    }

    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MaturityLevel{" + "min_age=" + min_age + ", description=" + description + '}';
    }
    
    
}
