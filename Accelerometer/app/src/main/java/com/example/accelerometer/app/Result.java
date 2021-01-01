package com.example.accelerometer.app;

public class Result {
    private int repititions;
    private int windowNo;
    private int numberOfWindows;
    private WindowType windowType;
    private int timestamp;

    public int getRepititions() {
        return repititions;
    }

    public void setRepititions(int repititions) {
        this.repititions = repititions;
    }

    public int getWindowNo() {
        return windowNo;
    }

    public void setWindowNo(int windowNo) {
        this.windowNo = windowNo;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public WindowType getWindowType() {
        return windowType;
    }

    public void setWindowType(WindowType windowType) {
        this.windowType = windowType;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
}
