package com.example.accelerometer.app.dsp;

import android.provider.ContactsContract;
import com.example.accelerometer.app.DataPoint;
import com.example.accelerometer.app.Signal;
import com.example.accelerometer.app.Window;

import java.util.ArrayList;
import java.util.List;

public class WindowProccessor implements SignalProcesser{

    List<DataPoint> dataPoints;

   private Window getWindow(int from, int to){

        Window window = new Window();
        List<DataPoint> dataPointsWindow = new ArrayList<>();
        for (int i=from; i < to; i++){
            dataPointsWindow.add(dataPoints.get(i));
        }
        window.setWindow(dataPointsWindow);
        return window;
    }

    @Override
    public Signal process(Signal signal) {
        int numberOfWindows=5;
        dataPoints= signal.getFullSignal();
        int size = dataPoints.size();
        int interval = size/numberOfWindows;

        for(int i=0; i<numberOfWindows; i++){
            signal.addWindow(getWindow(size/(i+1),size/(i+1) + interval));
        }

        return signal;
    }

    @Override
    public Window process(Window window) {
        return null;
    }
}
