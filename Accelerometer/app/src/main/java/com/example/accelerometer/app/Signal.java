package com.example.accelerometer.app;

import java.util.ArrayList;
import java.util.List;

public class Signal {
// Signal object to be populated from the signal generator/window procressor

    private List<Window> windows;
    private List<DataPoint> fullSignal;

    public void Signal(){
        windows = new ArrayList<>();
        fullSignal = new ArrayList<>();
    }

    public void addWindow(Window window){
        windows.add(window);
    }

    public void removeWindow(int i){
        windows.remove(i);
    }

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public List<DataPoint> getFullSignal() {
        return fullSignal;
    }

    public void setFullSignal(List<DataPoint> fullSignal) {
        this.fullSignal = fullSignal;
    }

}
