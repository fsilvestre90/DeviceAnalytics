package com.fsilvestre.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

import java.io.Serializable;
import java.util.UUID;

@Table("device_activity")
public class Location implements Serializable {

    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private UUID id;

    @PrimaryKeyColumn(name = "device_id", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    @JsonProperty("device_id")
    private String userId;

    @PrimaryKeyColumn(name = "epoch", ordinal = 2, type = PrimaryKeyType.PARTITIONED)
    private long timestamp;

    @Column(value = "latitude")
    private double latitude;

    @Column(value = "longitude")
    private double longitude;

    public Location() {
    }

    public String getUserId() {
        return userId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}