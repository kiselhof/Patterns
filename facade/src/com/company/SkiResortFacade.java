package com.company;

public class SkiResortFacade {
    private SkiRent _skiRent = new SkiRent();
    private SkiResortTicketSystem _skiResortTicketSystem = new SkiResortTicketSystem();
    private HotelBookingSystem _hotelBookingSystem = new HotelBookingSystem();

    // includes all data
    // returns total cost
    public int HaveGoodRest(int height, int weight, int feetSize, int skierLevel, int roomQuality)
    {
        int skiPrice = _skiRent.RentSki(weight, skierLevel);
        int skiBootsPrice = _skiRent.RentBoots(feetSize, skierLevel);
        int polePrice = _skiRent.RentPole(height);
        int oneDayTicketPr = _skiResortTicketSystem.BuyOneDayTicket();
        int hotelPrice = _hotelBookingSystem.BookRoom(roomQuality);
        return skiPrice + skiBootsPrice + polePrice + oneDayTicketPr + hotelPrice;
    }

    //returns one day cost without ski rent
    public int HaveRestWithOwnSkis()
    {
        int oneDayTicketPrice = _skiResortTicketSystem.BuyOneDayTicket();
        return oneDayTicketPrice;
    }

}