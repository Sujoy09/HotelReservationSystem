package com.bridgelabz;

public class HotelReservationTest {


    @org.junit.jupiter.api.Test
    void testToAddHotelInHotelReservationSystem() {
        HotelReservationMain hotel = new HotelReservationMain();
        hotel.welcome();
        HotelDetails lakeWood = new HotelDetails("Lakewood","3*","Weekday Rate = 150","Weekend Rate = 120");
        HotelDetails bridgeWood = new HotelDetails("Bridgewood", "4*", "Weekday Rate = 200", "Weekend Rate = 170");
        HotelDetails ridgeWood = new HotelDetails("Ridgewood","3.5*", "Weekday Rate = 180", "Weekend Rate = 150");
        hotel.addHotel(lakeWood);
        hotel.addHotel(bridgeWood);
        hotel.addHotel(ridgeWood);
        hotel.getHotel();
    }
}
