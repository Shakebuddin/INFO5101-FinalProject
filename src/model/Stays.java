/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lenovo
 */
public class Stays {
    
    private String HotelName;
    private String checkInDate;
    private String checkOutDate;
    private String Price;
    private String Feedback;
    private String guestEmail;
    private int guestId;

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public int getGuestId() {
        return guestId;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String HotelName) {
        this.HotelName = HotelName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }
    
    
    
}
