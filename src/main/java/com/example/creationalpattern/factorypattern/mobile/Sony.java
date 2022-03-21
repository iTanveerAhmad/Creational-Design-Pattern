package com.example.creationalpattern.factorypattern.mobile;

import com.example.creationalpattern.factorypattern.interfaces.Mobile;

public class Sony implements Mobile {

    private int ramSize;
    private String processor;

    public Sony(int ramSize, String processor) {
        this.ramSize = ramSize;
        this.processor = processor;
        System.out.println("Sony created with, --> RAM: "+ramSize+", PROCESSOR: "+processor);
    }
}
