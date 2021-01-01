package com.example.accelerometer;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.accelerometer.app.Signal;
import com.example.accelerometer.app.SignalGenerator;
import com.example.accelerometer.app.dsp.SignalProcesser;
import com.example.accelerometer.app.dsp.WindowProccessor;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.example.accelerometer", appContext.getPackageName());
    }


    //Here is a test to use which generates an example signal with 5 windows, if there are any errors/exceptions feel free to enhance
    //Ideally I would like to see this example signal in the ui as mentioned in the specification of the readme file.
    @Test
    public void signalGenerate() {
        Signal signalToView = SignalGenerator.readFile();

        // TODO: convert into builder pattern Liam
        WindowProccessor windowProccessor = new WindowProccessor();
        Signal processedSignal = windowProccessor.process(signalToView);


    }
}
