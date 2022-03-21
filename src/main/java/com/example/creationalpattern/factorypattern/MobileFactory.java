package com.example.creationalpattern.factorypattern;

import com.example.creationalpattern.factorypattern.interfaces.Mobile;
import com.example.creationalpattern.factorypattern.mobile.IPhone;
import com.example.creationalpattern.factorypattern.mobile.Samsung;
import com.example.creationalpattern.factorypattern.mobile.Sony;

public class MobileFactory {

    public static Mobile getMobile(String type){

        switch (type) {
            case Mobile.IPHONE:
                return new IPhone(2, "A9", "A9GPU");
            case Mobile.SONY:
                return new Sony(2, "ARM");
            case Mobile.SAMSUNG:
                return new Samsung("Intel");
            default:
                return null;
        }
    }

}
