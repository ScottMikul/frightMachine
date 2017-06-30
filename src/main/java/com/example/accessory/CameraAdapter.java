package com.example.accessory;

import com.example.motion.MotionDetector;
import com.teamtreehouse.techdegree.hardware.Camera;
import com.teamtreehouse.techdegree.hardware.FrightMachine;
import com.teamtreehouse.techdegree.hardware.Status;

import java.util.Observable;

/**
 * Created by scott on 6/29/2017.
 */
public class CameraAdapter implements Accessory {
    private Camera adaptee;

    public CameraAdapter(Camera adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void activate() {
        adaptee.snapPhotos();
    }

    @Override
    public void update(Observable o, Object arg) {
        FrightMachine motionDetector = (FrightMachine) o;
        if(motionDetector.getStatus()== Status.FRIGHTEN)
        activate();
    }
}
