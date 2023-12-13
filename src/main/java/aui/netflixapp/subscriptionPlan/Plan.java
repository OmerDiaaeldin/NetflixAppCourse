/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.subscriptionPlan;

/**
 *
 * @author odaio
 */

public class Plan {
    private double cost;
    private int screen_num;
    private int downloaded_devices;
    private Quality quality;

    public Plan(double cost, int screen_num, int downloaded_devices, Quality quality) {
        this.cost = cost;
        this.screen_num = screen_num;
        this.downloaded_devices = downloaded_devices;
        this.quality = quality;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getScreen_num() {
        return screen_num;
    }

    public void setScreen_num(int screen_num) {
        this.screen_num = screen_num;
    }

    public int getDownloaded_devices() {
        return downloaded_devices;
    }

    public void setDownloaded_devices(int downloaded_devices) {
        this.downloaded_devices = downloaded_devices;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Plan{" + "cost=" + cost + ", screen_num=" + screen_num + ", downloaded_devices=" + downloaded_devices + ", quality=" + quality + '}';
    }
    
}