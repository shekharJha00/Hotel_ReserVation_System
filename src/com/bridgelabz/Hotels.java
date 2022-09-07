package com.bridgelabz;

public class Hotels {
String hotelName;
int regularRates;

    public Hotels(String hotelName, int regularRates) {
        this.hotelName = hotelName;
        this.regularRates = regularRates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRegularRates() {
        return regularRates;
    }

    public void setRegularRates(int regularRates) {
        this.regularRates = regularRates;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "hotelName='" + hotelName + '\'' +
                ", regularRates=" + regularRates +
                '}';
    }
}
