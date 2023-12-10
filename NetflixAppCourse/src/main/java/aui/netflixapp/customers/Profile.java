/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aui.netflixapp.customers;


import aui.netflixapp.shows.MaturityLevel;
import aui.netflixapp.shows.Languages;
import aui.netflixapp.shows.Show;
/**
 *
 * @author odaio
 */
public class Profile {
    protected String name;
    protected MaturityLevel level_restriction;
    protected String email;
    protected boolean toNotify;
    protected Languages language;
    protected boolean subtitles;
    protected Show[] favorites;
    protected Show[] blocked;
    protected Languages subtitle_lang;

    public Profile(String name, MaturityLevel level_restriction, String email, boolean toNotify, Languages language, boolean subtitles, Show[] favorites, Show[] blocked, Languages subtitle_lang) {
        this.name = name;
        this.level_restriction = level_restriction;
        this.email = email;
        this.toNotify = toNotify;
        this.language = language;
        this.subtitles = subtitles;
        this.favorites = favorites;
        this.blocked = blocked;
        this.subtitle_lang = subtitle_lang;
    }
    
    public void modify_maturity() {
        
    }
    
    public void add_favorite() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaturityLevel getLevel_restriction() {
        return level_restriction;
    }

    public void setLevel_restriction(MaturityLevel level_restriction) {
        this.level_restriction = level_restriction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isToNotify() {
        return toNotify;
    }

    public void setToNotify(boolean toNotify) {
        this.toNotify = toNotify;
    }

    public Languages getLanguage() {
        return language;
    }

    public void setLanguage(Languages language) {
        this.language = language;
    }

    public boolean isSubtitles() {
        return subtitles;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }

    public Show[] getFavorites() {
        return favorites;
    }

    public void setFavorites(Show[] favorites) {
        this.favorites = favorites;
    }

    public Show[] getBlocked() {
        return blocked;
    }

    public void setBlocked(Show[] blocked) {
        this.blocked = blocked;
    }

    public Languages getSubtitle_lang() {
        return subtitle_lang;
    }

    public void setSubtitle_lang(Languages subtitle_lang) {
        this.subtitle_lang = subtitle_lang;
    }

    @Override
    public String toString() {
        return "Profile{" + "name=" + name + ", level_restriction=" + level_restriction + ", email=" + email + ", toNotify=" + toNotify + ", language=" + language + ", subtitles=" + subtitles + ", favorites=" + favorites + ", blocked=" + blocked + ", subtitle_lang=" + subtitle_lang + '}';
    }
    
    
}
