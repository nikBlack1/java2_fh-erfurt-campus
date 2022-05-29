package main.model;

import main.storage.AbstractDatabaseEntity;

import javax.persistence.Entity;
import java.io.Serializable;


@Entity
public class Building extends AbstractDatabaseEntity implements Serializable
{
    private String title;
    private Boolean accessibility;
    private String geolocation;
    private Boolean isDorm;

    public Building(String title, Boolean accessibility, String geolocation, Boolean isDorm)
    {
        this.title = title;
        this.accessibility = accessibility;
        this.geolocation = geolocation;
        this.isDorm = isDorm;
    }


    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }

    public Boolean getAccessibility()
    {
        return this.accessibility;
    }

    public void setAccessibility(Boolean newAccessibility)
    {
        this.accessibility = newAccessibility;
    }

    public Boolean getGeolocation()
    {
        return this.accessibility;
    }

    public void setGeolocation(Boolean newAccessibility)
    {
        this.accessibility = newAccessibility;
    }

    public Boolean checkIfIsDorm()
    {
        return this.isDorm;
    }

    public void setBuildingAsDorm()
    {
        this.isDorm = true;
    }

    public void setBuildingAsNotDorm()
    {
        if (!this.isDorm) 
        {
            System.out.println("This building is already a dorm!");
            return;
        }
        this.isDorm = false;
    }

    public void unsetBuildingAsDorm()
    {
        if (!this.isDorm)
        {
            System.out.println("This building is already NOT a dorm!");
            return;
        }
        this.isDorm = false;
    }
}
