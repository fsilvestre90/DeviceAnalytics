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

    @PrimaryKeyColumn(name = "id", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private UUID id;

    @PrimaryKeyColumn(name = "user_id", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    @JsonProperty("user_id")
    private long userId;

    @PrimaryKeyColumn(name = "timestamp", ordinal = 2, type = PrimaryKeyType.PARTITIONED)
    private long timestamp;

    @Column(value = "latitude")
    private double latitude;

    @Column(value = "longitude")
    private double longitude;

    public Location() {
    }

    public long getUserId() {
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