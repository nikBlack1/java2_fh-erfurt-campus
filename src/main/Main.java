package main;

import main.storage.DataProvider;

import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Avemarg
 * Date: 07.11.13
 * Time: 16:42
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println(DataProvider.createTestBuilding().getTitle());
        System.out.println(DataProvider.createTestBuilding().checkIfIsDorm());


        // 1) Initialize the app and its dependencies


        // 2) user inputs the search word and selects the filter


        // 3) Based on the given data - the program starts the DB
        //          search and outputs the data to the user
    }
}
