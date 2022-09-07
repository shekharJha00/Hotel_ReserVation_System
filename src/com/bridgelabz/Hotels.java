package com.bridgelabz;

public class Hotels {
String hotelName;
int regularRates;

int total;

    public Hotels(String hotelName,int regularRates) {
        this.hotelName = hotelName;
        this.regularRates = regularRates;
    }

    public Hotels() {
        super();
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "hotelName='" + hotelName + '\'' +
                ", regularRates=" + regularRates +
                ", total=" + total +
                '}';
    }
}
