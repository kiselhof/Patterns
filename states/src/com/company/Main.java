package com.company;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.startPlay();
        player.Next();
        player.Next();
        player.Next();
        player.Previous();
        System.out.println(player.getCurrentTrack());
    }
}
