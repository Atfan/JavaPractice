package com.company.abstracttest;

public abstract class AbstractDevice {
    protected String deviceName;

    public AbstractDevice(String deviceName) {
        this.deviceName = deviceName;
    }
    public abstract String Show();
}
