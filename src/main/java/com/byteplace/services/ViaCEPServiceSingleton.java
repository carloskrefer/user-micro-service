package com.byteplace.services;

public class ViaCEPServiceSingleton {

    private static ViaCEPServiceSingleton instance;

    private ViaCEPServiceSingleton() {}

    public static ViaCEPServiceSingleton getInstance() {
        if (instance == null) {
            return new ViaCEPServiceSingleton();
        }

        return instance;
    }



}
