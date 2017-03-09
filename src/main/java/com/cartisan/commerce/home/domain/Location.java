package com.cartisan.commerce.home.domain;

import lombok.Data;

@Data
public class Location {
    private String place;
    private String year;

    public Location(String place, String year) {
        this.place = place;
        this.year = year;
    }
}
