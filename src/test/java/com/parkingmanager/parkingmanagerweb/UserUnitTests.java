package com.parkingmanager.parkingmanagerweb;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import com.parkingmanager.parkingmanagerweb.user.User;

import static org.junit.jupiter.api.Assertions.*;
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class UserUnitTests {

    private User user;
    @BeforeEach
    void init() {
        user = new User("David", "Hormigo", "Ramírez", 'P');
    }
    @Test
    void check_get_first_name() {
        String expected = "David";

        String actual = user.getFirstName();

        assertEquals(expected,actual);
    }
    @Test
    void testGetLastName1() {

        String expected = "Hormigo";
        String actual = user.getLastName1();
        assertEquals(expected,actual);

    }

    @Test
    void testGetLastName2() {

        String expected = "Ramírez";
        String actual = user.getLastName2();
        assertEquals(expected,actual);

    }

    @Test
    void testGetRole() {
        char expected = 'P';
        char actual = user.getRole();
        assertEquals(expected,actual);
    }

    @Test
    void testSetFirstName() {
        String expected = "Manuel";
        user.setFirstName("Manuel");
        String actual = user.getFirstName();
        assertEquals(expected,actual);        
   }

    @Test
    void testSetLastName1() {
        String expected = "Padrique";
        user.setLastName1("Padrique");
        String actual = user.getLastName1();
        assertEquals(expected,actual);  
    }

    @Test
    void testSetLastName2() {
        String expected = "Zubizarreta";
        user.setLastName2("Zubizarreta");
        String actual = user.getLastName2();
        assertEquals(expected,actual);  
    }

    @Test
    void testSetRole() {
        char expected = 'A';
        user.setRole('A');
        char actual = user.getRole();
        assertEquals(expected,actual);

    }
}
