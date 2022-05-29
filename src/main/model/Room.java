package main.model;
import main.storage.AbstractDatabaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Room extends AbstractDatabaseEntity implements Serializable{

    private String RoomTitle;
    private Integer RoomFloor;
    private String RoomType;
    private static Integer RoomCounter = 0;

    public Room(String inRoomTitle, Integer inRoomFloor, String inRoomType){

        setRoomTitle(inRoomTitle);
        setRoomFloor(inRoomFloor);
        setRoomType(inRoomType);
    }

    public void setRoomTitle(String inRoomTitle){
        this.RoomTitle=inRoomTitle;
    }

    public void setRoomFloor(Integer inRoomFloor){
        this.RoomFloor=inRoomFloor;
    }

    public void setRoomType(String inRoomType){
        this.RoomType=inRoomType;
    }
}