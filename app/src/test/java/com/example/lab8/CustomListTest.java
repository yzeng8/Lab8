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

}
