package main.storage;


import main.model.Building;

/**
 * Created with IntelliJ IDEA.
 * User: avemarg
 * Date: 20.01.15
 * Time: 12:52
 */
public class DataProvider
{
    public static Building createTestBuilding()
    {
        /*
            Crate a building and fill it with some data
         */
        Building building1 = new Building(
                "Haus 1",
                true,
                "50.985229758942054, 11.04130305237468",
                false
        );


        return building1;
    }
}
