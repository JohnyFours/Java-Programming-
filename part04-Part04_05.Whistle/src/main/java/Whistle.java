/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
 */
public class Whistle {

    private String sound;

    public Whistle(String whisleSound) {
        this.sound = whisleSound;
    }

    public void sound() {
        System.out.println(sound);
    }

}
