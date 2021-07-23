package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationMain {
    private HotelDetails hotelArr[] = new HotelDetails[5];
    private List<HotelDetails> hotelList = new ArrayList<HotelDetails>();
    private int index = 0;
    private String hotelName;
    private String rating;
    private String weekRates;
    private String weekendRates;

    public HotelReservationMain() {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekRates = weekRates;
        this.weekendRates = weekendRates;
    }
    public void welcome() {
        System.out.println("Welcome To Hotel Reservation System!!!");
    }
    public boolean addHotel(HotelDetails hotel) {
        return this.hotelList.add((HotelDetails) hotel );
    }
    public void getHotel() {
        System.out.println(hotelList.toString());
    }
}
