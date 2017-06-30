package com.example.accessory;

import com.teamtreehouse.techdegree.hardware.FrightMachine;
import com.teamtreehouse.techdegree.hardware.Status;

import java.util.Observable;

public class Horn extends Observable implements Accessory {
    @Override
    public void activate() {
        System.out.println("BEEEEEEEP!");
    }

    @Override
    public void update(Observable o, Object arg) {
        FrightMachine motionDetector = (FrightMachine) o;
        if(motionDetector.getStatus()== Status.FRIGHTEN)
            activate();
    }
}
