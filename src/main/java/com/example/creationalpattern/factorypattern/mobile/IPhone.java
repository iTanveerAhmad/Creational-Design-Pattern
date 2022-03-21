package com.example.creationalpattern.factorypattern.mobile;

import com.example.creationalpattern.factorypattern.interfaces.Mobile;

public class IPhone implements Mobile {

    private int ramSize;
    private String processor;
    private String GPU;

    public IPhone(int ramSize, String processor, String GPU) {
        this.ramSize = ramSize;
        this.processor = processor;
        this.GPU = GPU;
        System.out.println("IPhone created with, --> RAM: "+ramSize+", PROCESSOR: "+processor+", GPU: "+GPU);
    }


}
