package com.ivoyant.inheritance;

interface SmartDevice {
    void connectToWifi();
}


class SmartTV implements SmartDevice {
    public void connectToWifi() {
        System.out.println("Smart TV connected to WiFi.");
    }
}

class SmartSpeaker extends SmartTV implements SmartDevice {
    public void connectToWifi() {
        System.out.println("Smart Speaker connected to WiFi.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        SmartDevice tv = new SmartTV();
        tv.connectToWifi();

        SmartDevice speaker = new SmartSpeaker();
        speaker.connectToWifi();
    }
}