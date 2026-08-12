package org.tnsif.acc.c2tc.interfacedemo;

public class cameraANDphoto implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }
}
