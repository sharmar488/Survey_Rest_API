package com.surveyapi.surveyapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

// entity depicting student details
@Entity
public class student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    Integer id;

    @NotNull
    String firstName;

    @NotNull
    String lastName;

    @NotNull
    String streetAddress;

    @NotNull
    String city;

    @NotNull
    String state;

    @NotNull
    String zip;

    @NotNull
    String telephone_num;

    @NotNull
    String email;

    @NotNull
    String date;

    String mostLiked;

    String interest;

    String recommendation;

    public String getMostLiked() {
        return mostLiked;
    }

    public void setMostLiked(String mostLiked) {
        this.mostLiked = mostLiked;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTelephone_num() {
        return telephone_num;
    }

    public void setTelephone_num(String telephone_num) {
        this.telephone_num = telephone_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
