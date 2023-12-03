/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import view.*;

/**
 *
 * @author lenovo
 */
public class Database {
    
    private static final String URL = "jdbc:mysql://localhost:3306/mysql?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "shakebdocker@03";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private Database() {
    }

    /**
     * Insert given user to database
     *
     * @see User
     * @param user User object to be added
     */
    
    /*
    public static void addUser(User user) {
        //add to database
        String query = "INSERT INTO USER(NAME,AGE) VALUES(?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,
                PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.getAge());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
        // conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    */
    
    /**
     * Insert given user to database
     *
     * @see User
     * @param guest User object to be added
     */
    public static void createGuest(Guest guest) {
        //add to database
        String query = "INSERT INTO Guest(FirstName, LastName, Email, Phone, AddressLine1, AddressLine2, State, Country) VALUES(?,?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,
                PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, guest.getFname());
            stmt.setString(2, guest.getLname());
            stmt.setString(3, guest.getEmail());
            stmt.setString(4, guest.getPhone());
            stmt.setString(5, guest.getAddressLine1());
            stmt.setString(6, guest.getAddressLine2());
            stmt.setString(7, guest.getState());
            stmt.setString(8, guest.getCity());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
        // conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Insert given stay to database
     *
     * @see User
     * @param stay User object to be added
     */
    public static void createBooking(Stays stay) {
        //add to database
        String query = "INSERT INTO Stays(HotelName, FromDate, ToDate, Bill, Feedback, GuestEmail) VALUES(?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,
                PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, stay.getHotelName());
            stmt.setString(2, stay.getCheckInDate());
            stmt.setString(3, stay.getCheckOutDate());
            stmt.setString(4, stay.getPrice());
            stmt.setString(5, stay.getFeedback());
            stmt.setString(6, stay.getGuestEmail());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
            System.out.println("Booking Created");

            // conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Return lost of all users in database
     *
     * @see User
     * @return list of users
     */
    
    
    public static ArrayList<Stays> getAllStays() {
// return list of users from db
        ArrayList<Stays> stays = new ArrayList<>();
        String query = "SELECT * FROM Stays";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,
                PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Stays s = new Stays();
                s.setGuestId(rs.getInt("GuestId"));
                s.setHotelName(rs.getString("HotelName"));
                s.setCheckInDate(rs.getString("FromDate"));
                s.setCheckOutDate(rs.getString("ToDate"));
                s.setPrice(rs.getString("Bill"));
                s.setFeedback(rs.getString("Feedback"));
//                g.setAddressLine2(rs.getString("AddressLine2"));
//                g.setState(rs.getString("State"));
//                g.setCity(rs.getString("Country"));
//                u.setAge(rs.getInt("age"));
//                u.setId(rs.getInt("id"));
                stays.add(s);
//                guest.setFirstname(re.)
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stays;
    }
    
    

    /**
     * Delete given user from database
     *
     * @see User
     * @param u User to be deleted
     *
     */
    
    /*
    public static void deleteUser(User u) {
        String query = "delete from USER where id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,
                PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, u.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    */
    /**
     * Edit given user details in the database
     *
     * @param oldUser existing user in database
     * @param newUser modified user details to be added
     */
    
    
    public static void updateBooking(Stays newStay, int id) {
        String query = "UPDATE Stays SET Hotelname=?, FromDate=?, ToDate=?, Bill=?, Feedback=?, GuestEmail=? WHERE id=?";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,
                PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.setString(2, newStay.getHotelName());
            stmt.setString(3, newStay.getCheckInDate());
            stmt.setString(4, newStay.getCheckOutDate());
            stmt.setString(5, newStay.getPrice());
            stmt.setString(6, newStay.getFeedback());
            stmt.setString(7, newStay.getGuestEmail());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * view user details in the database
     *
     * @param searchQuery search query
     */
    public static ArrayList<Guest> viewGuest(String searchQuery){
        ArrayList<Guest> guest = new ArrayList<>();
        
        String query = "SELECT * FROM Guest where Email='" + searchQuery +"'";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,
                PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
//                User u = new User();
                Guest g = new Guest();
                g.setFname(rs.getString("FirstName"));
                g.setLname(rs.getString("LastName"));
                g.setEmail(rs.getString("Email"));
                g.setPhone(rs.getString("Phone"));
                g.setAddressLine1(rs.getString("AddressLine1"));
                g.setAddressLine2(rs.getString("AddressLine2"));
                g.setState(rs.getString("State"));
                g.setCity(rs.getString("Country"));
//                u.setAge(rs.getInt("age"));
//                u.setId(rs.getInt("id"));
                guest.add(g);
//                guest.setFirstname(re.)
            }
            rs.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return guest;
    }
    
    /**
     * view user details in the database
     *
     * @param searchQuery search query
     */
    public static ArrayList<Stays> getStays(String searchQuery){
        ArrayList<Stays> stay = new ArrayList<>();
        
        String query = "SELECT * FROM Stays where GuestEmail='" + searchQuery +"'";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,
                PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
//                User u = new User();
                Stays s = new Stays();
                s.setGuestId(rs.getInt("GuestId"));
                s.setHotelName(rs.getString("HotelName"));
                s.setCheckInDate(rs.getString("FromDate"));
                s.setCheckOutDate(rs.getString("ToDate"));
                s.setPrice(rs.getString("Bill"));
                s.setFeedback(rs.getString("Feedback"));
//                g.setAddressLine2(rs.getString("AddressLine2"));
//                g.setState(rs.getString("State"));
//                g.setCity(rs.getString("Country"));
//                u.setAge(rs.getInt("age"));
//                u.setId(rs.getInt("id"));
                stay.add(s);
//                guest.setFirstname(re.)
            }
            rs.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stay;
    }
    
    /**
     * view user details in the database
     *
     * @param searchQuery search query
     */
    public static ArrayList<Membership> getMembership(String searchQuery){
        ArrayList<Membership> membership = new ArrayList<>();
        
        String query = "SELECT * FROM Memberships where GuestEmail='" + searchQuery +"'";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME,
                PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
//                User u = new User();
                Membership m = new Membership();
                m.setMembershipId(rs.getString("MembershipId"));
                m.setGuestEmail(rs.getString("GuestEmail"));
                m.setMembershipTier(rs.getString("MemebershipTier"));
                m.setExpiry(rs.getString("ExpiryDate"));
                m.setJoin(rs.getString("JoinDate"));
                m.setType(rs.getString("Type"));
//                s.setFeedback(rs.getString("Feedback"));
//                g.setAddressLine2(rs.getString("AddressLine2"));
//                g.setState(rs.getString("State"));
//                g.setCity(rs.getString("Country"));
//                u.setAge(rs.getInt("age"));
//                u.setId(rs.getInt("id"));
                membership.add(m);
//                guest.setFirstname(re.)
            }
            rs.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return membership;
    }
}
