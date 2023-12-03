/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lenovo
 */
public class Membership {
    private String GuestEmail;
    private String MembershipTier;
    private String Type;
    private String Expiry;
    private String Join;
    private String MembershipId;

    public String getMembershipId() {
        return MembershipId;
    }

    public void setMembershipId(String MembershipId) {
        this.MembershipId = MembershipId;
    }

    public String getGuestEmail() {
        return GuestEmail;
    }

    public void setGuestEmail(String GuestEmail) {
        this.GuestEmail = GuestEmail;
    }

    public String getMembershipTier() {
        return MembershipTier;
    }

    public void setMembershipTier(String MembershipTier) {
        this.MembershipTier = MembershipTier;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getExpiry() {
        return Expiry;
    }

    public void setExpiry(String Expiry) {
        this.Expiry = Expiry;
    }

    public String getJoin() {
        return Join;
    }

    public void setJoin(String Join) {
        this.Join = Join;
    }
    
    
    
}
