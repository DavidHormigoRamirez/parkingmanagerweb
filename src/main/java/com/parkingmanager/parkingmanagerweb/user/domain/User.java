package com.parkingmanager.parkingmanagerweb.user.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    // Propiedades
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Nonnull
    private String email;

    private String firstName;
    private String lastName1;

    private String lastName2;

    private char role;
    // Constructores
    public User(String email,String firstName, String lastName1, String lastName2, char role) {
        this.email = email;
        this.firstName = firstName;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.role = role;
    }
    protected User() {
        
    }
    public long getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    // Métodos
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public char getRole() {
        return role;
    }

    public void setRole(char role) {
        this.role = role;
    }


    
}
