package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.example.motion.MotionDetector;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class FrightMachine extends MotionDetector {
/*
    private final Horn horn;
    private final Strobe strobe;
    private final Camera camera;
*/
    private Status status;


    public FrightMachine() {
        status = Status.WAIT;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addSpookyness(Accessory a){
        addObserver(a);
    }
    @Override
    public void onMotionDetected() {
        // TODO: This is hardcoded, we should make it more extensible!  :(
       /* horn.activate();
        strobe.activate();
        camera.snapPhotos(5);
        */
        status = Status.FRIGHTEN;
        setChanged();
        notifyObservers();
    }

}
