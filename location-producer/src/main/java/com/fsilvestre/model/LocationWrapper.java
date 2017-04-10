package com.fsilvestre.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LocationWrapper {

    @JsonProperty("data")
    private List<Location> locationList;

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }
}
