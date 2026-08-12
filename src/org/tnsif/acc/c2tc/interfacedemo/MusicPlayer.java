package org.tnsif.acc.c2tc.interfacedemo;

public interface MusicPlayer {

        public default void playMusic() {
            System.out.println("playing music");
        }

}
