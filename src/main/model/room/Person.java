package main.model.room;

import javax.persistence.Entity;

@Entity
public class Person {

    private String AcademicTitle;
    private String FirstName;
    private String LastName;
    private Integer RoomID;

    public Person(String inAcademicTitle, String inFirstName, String inLastName, Integer inRoomID){

        setAcademicTitle(inAcademicTitle);
        setFirstName(inFirstName);
        setLastName(inLastName);
        setRoomID(inRoomID);
    }


    /**
     * set functions
     */
    public void setAcademicTitle(String inAcademicTitle){
        this.AcademicTitle=inAcademicTitle;
    }

    public void setFirstName(String inFistName){
        this.FirstName=inFistName;
    }

    public void setLastName(String inLastName){
        this.LastName=inLastName;
    }

    public void setRoomID(Integer inRoomID){
        this.RoomID=inRoomID;
    }

    /**
     * get functions
     */

    /**
     * delete functions
     */
}
