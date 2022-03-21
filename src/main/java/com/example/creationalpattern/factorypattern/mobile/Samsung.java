package com.example.creationalpattern.factorypattern.mobile;

import com.example.creationalpattern.factorypattern.interfaces.Mobile;

public class Samsung implements Mobile {

    private String processor;

    public Samsung( String processor) {
        this.processor = processor;
        System.out.println("Samsung created with, --> PROCESSOR: "+processor);
    }

}
