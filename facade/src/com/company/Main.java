package com.company;

public class Main {

    public static void main(String[] args) {

        int height = 170;
        int weight = 60;
        int feetSize = 40;
        int skierLevel = 3;
        int roomQuality = 3;

        SkiResortFacade skiResortFacade = new SkiResortFacade();
        skiResortFacade.HaveGoodRest(height, weight, feetSize, skierLevel, roomQuality);
    }
}
