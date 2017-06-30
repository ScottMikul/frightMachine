package com.example.accessory;

import com.teamtreehouse.techdegree.hardware.FrightMachine;
import com.teamtreehouse.techdegree.hardware.Status;

import java.util.Observable;

public class Strobe implements Accessory {
    @Override
    public void activate() {
        System.out.println("Flashing lights!!!  Flash, flash, flash");
    }

    @Override
    public void update(Observable o, Object arg) {
        FrightMachine motionDetector = (FrightMachine) o;
        if(motionDetector.getStatus()== Status.FRIGHTEN)
            activate();
    }
}
