package com.bridgelabz;

public class HotelDetails {
    private String hotelName;
    private String rating;
    private String weekRates;
    private String weekendRates;

    public HotelDetails(String hotelName, String s, String s1, String s2) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.weekRates = weekRates;
        this.weekendRates = weekendRates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getWeekRates() {
        return weekRates;
    }

    public void setWeekRates(String weekRates) {
        this.weekRates = weekRates;
    }

    public String getWeekendRates() {
        return weekendRates;
    }

    public void setWeekendRates(String weekendRates) {
        this.weekendRates = weekendRates;
    }
}
