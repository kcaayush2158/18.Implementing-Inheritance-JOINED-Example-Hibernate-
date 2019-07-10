package com.application.entity;

import javax.persistence.Entity;

@Entity()
public class TwoWheeler extends  Vehicle{
    public String steeringHandler;

    public String getSteeringHandler() {
        return steeringHandler;
    }

    public void setSteeringHandler(String steeringHandler) {
        this.steeringHandler = steeringHandler;
    }
}
