package com.fsilvestre.model;

public class Location {
    private double latitude;
    private double longitude;
    private long timestamp;

    public Location() {
    }

    public Location(double latitude, double longitude, long timestamp) {
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return latitude + "/" + longitude + "/" + timestamp + "/";
    }
}
