/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
 */
public class Film {

    private String name;
    private int ageRaing;

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRaing = filmAgeRating;
    }

    public String name() {
        return this.name;
    }

    public int ageRating() {
        return this.ageRaing;
    }
}
