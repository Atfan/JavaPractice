package com.company.abstracttest;

public class Mobile extends AbstractDevice {
    public Mobile(String deviceName) {
        super(deviceName);
    }

    @Override
    public String Show() {
        return deviceName;
    }
}
