package com.example.accelerometer.app;

public class DataPoint {
    private long timestamp;
    private long magnitude;


    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(long magnitude) {
        this.magnitude = magnitude;
    }
}
