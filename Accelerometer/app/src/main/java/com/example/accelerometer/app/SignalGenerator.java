package com.example.accelerometer.app;
import android.os.Build;
import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Used to generate a signal, this will be used for testing example signals from a file.
//file is located under resources directory, not "res", feel free to move.
public class SignalGenerator {

    public static void generate(){
        double a = 30;

        // converting values to radians
        double b = Math.toRadians(a);

        System.out.println(Math.sin(b));

        a = 45;

        // converting values to radians
        b = Math.toRadians(a);

        System.out.println(Math.sin(b));

        a = 60;

        // converting values to radians
        b = Math.toRadians(a);

        System.out.println(Math.sin(b));

        a = 90;

        // converting values to radians
        b = Math.toRadians(a);

        System.out.println(Math.sin(b));
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static Signal readFile(){
        Signal signal =  new Signal();
        DataPoint tempdp = new DataPoint();

        try (BufferedReader br = new BufferedReader(new FileReader("resources/sine_wave.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                tempdp.setTimestamp(Long.parseLong(values[0]));
                tempdp.setTimestamp(Long.parseLong(values[0]));
                signal.getFullSignal().add(tempdp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return signal;
    }
}
