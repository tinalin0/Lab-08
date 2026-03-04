package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);

        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        // This will fail because deleteCity doesn't exist
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testCountCities() {
        // Starts with 1 in list
        CustomList list = new CustomList();
        list.addCity(new City("Montreal", "Quebec"));
        assertEquals(1, list.countCities());

        list.addCity(new City("Quebec City", "Quebec"));
        assertEquals(2, list.countCities());
    }
}
