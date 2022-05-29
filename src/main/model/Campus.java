package main.model;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Campus {

    private String CampusID;
    private Enum CampusTitle;
    private String CampusGeoLocation;
    private String CampusAddress;
    private Integer CampusZip;

    public Campus(String CampusID, Enum CampusTitle, String CampusGeoLocation, String CampusAddress, Integer CampusZip) {

        this.CampusID = CampusID;
        this.CampusTitle = CampusTitle;
        this.CampusGeoLocation = CampusGeoLocation;
        this.CampusAddress = CampusAddress;
        this.CampusZip = CampusZip;
    }

    //----getter----//
    public String getCampusID() {return this.CampusID;}
    public Enum getCampusTitle() {return this.CampusTitle;}
    public String getCampusGeoLocation() {return this.CampusGeoLocation;}
    public String getCampusAddress() {return this.CampusAddress;}
    public Integer getCampusZip() {return this.CampusZip;}

    //----setter----//
    public void setCampusID(String newCampusID)
    {
        this.CampusID = newCampusID;
    }
    public void setCampusTitle(Enum newCampusTitle) { this.CampusTitle = newCampusTitle; }
    public void setCampusGeoLocation(String newCampusGeoLocation)
    {
        this.CampusGeoLocation = newCampusGeoLocation;
    }
    public void setCampusAddress(String newCampusAddress)
    {
        this.CampusAddress = newCampusAddress;
    }
    public void setCampusZip(Integer newCampusZip)
    {
        this.CampusZip = newCampusZip;
    }







}
