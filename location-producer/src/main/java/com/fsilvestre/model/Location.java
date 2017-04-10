package com.fsilvestre.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

    @JsonProperty("device_id")
    private String userId;
    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("longitude")
    private double longitude;
    @JsonProperty("timestamp")
    private long timestamp;

    public String getUserId() {
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
        return userId + "/" + latitude + "/" + longitude + "/" + timestamp + "/";
    }

}
