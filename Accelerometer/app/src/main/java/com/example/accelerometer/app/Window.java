package com.example.accelerometer.app;

import java.util.List;

public class Window {
// series of data points for a partial signal
    private List<DataPoint> window;

    public List<DataPoint> getWindow() {
        return window;
    }

    public void setWindow(List<DataPoint> window) {
        this.window = window;
    }
}
