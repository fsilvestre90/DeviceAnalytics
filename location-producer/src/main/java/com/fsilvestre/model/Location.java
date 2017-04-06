package com.fsilvestre.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

    @JsonProperty("user_id")
    private long userId;
    private double latitude;
    private double longitude;
    private long timestamp;

    public long getUserId() {
        return userId;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return latitude + "/" + longitude + "/" + timestamp + "/";
    }

}
