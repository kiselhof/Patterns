package com.company;

public class HotelBookingSystem {
    public int BookRoom(int roomQuality)
    {
        switch (roomQuality)
        {
            case 3:
                return 250; //cost
            case 4:
                return 500; //cost
            case 5:
                return 900; //cost
            default: //if no matchings
                throw new IllegalArgumentException(
                        "roomQuality should be in range [3;5]");
        }
    }
}
