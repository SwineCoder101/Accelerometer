package com.example.accelerometer.app.dsp;

import com.example.accelerometer.app.Signal;
import com.example.accelerometer.app.Window;

public interface SignalProcesser {
    Signal process(Signal signal);
    Window process(Window window);
}
