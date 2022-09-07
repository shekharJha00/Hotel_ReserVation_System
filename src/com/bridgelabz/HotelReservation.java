package com.bridgelabz;
public class HotelReservation {

    public static void main(String[] args) {
        HotelReservationSystem hotel = new HotelReservationSystem();

        System.out.println("--Welcome to Hotel Rates Program--");
        System.out.println(" ");

        hotel.addHotel();
        hotel.showHotelInfo();

        System.out.println(" ");
        System.out.println("Cheapest Hotel Based on RegularRate");
        hotel.cheapestHotel("10-Sep-2020", "11-Sep-2020");
        System.out.println(" ");

    }

}



