package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> citylist= new ArrayList<>();

    @Test
    public void testAddCity(){
        CustomList list = new CustomList(null,citylist);
        City city = new City ("Edmonton","AB");
        list.addCity(city);
        assertEquals(1,list.getCount());

    }
    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList(null,citylist);
        City city = new City ("Edmonton","AB");
        list.addCity(city);
        assertEquals(1,list.getCount());
        list.deleteCity(city);
        assertEquals(0,list.getCount());
    }

    @Test
    public void testHasCity(){
        CustomList list = new CustomList(null,citylist);
        City city = new City ("Edmonton","AB");
        assertEquals(false,list.hasCity(city));
        list.addCity(city);
        assertEquals(true,list.hasCity(city));

    }
    @Test
    public void testCountCity(){
        CustomList list = new CustomList(null,citylist);
        City city1 = new City ("Edmonton","AB");
        list.addCity(city1);
        City city2 = new City ("Calgary","AB");
        list.addCity(city2);
        City city3 = new City ("Vancouver","BC");
        list.addCity(city3);
        assertEquals(3,list.countCity());

    }


}
