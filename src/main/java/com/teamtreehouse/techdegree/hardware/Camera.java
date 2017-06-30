package com.teamtreehouse.techdegree.hardware;

public class Camera {

    int photosToBeTaken;

    public Camera(int photosToBeTaken) {
        this.photosToBeTaken = photosToBeTaken;
    }

    public void snapPhotos(){
        snapPhotos(photosToBeTaken);
    }

    public void snapPhotos(int numberOfPhotos) {
        for (int i = 0; i < numberOfPhotos; i++) {
            System.out.println("SNAP:  Photo #" + (i + 1) + " taken");
        }
    }


}
