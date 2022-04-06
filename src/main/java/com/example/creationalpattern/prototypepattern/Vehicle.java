package com.example.creationalpattern.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable{

    private List<String> vehicleList;

    public Vehicle(){
        vehicleList = new ArrayList<>();
    }

    public Vehicle(List<String> vehicleList){
        this.vehicleList = vehicleList;
    }

    public void insertData(){
        vehicleList.add("Suzuki mehran");
        vehicleList.add("Suzuki Alto");
        vehicleList.add("Suzuki WagonR");
        vehicleList.add("Suzuki Cultus");
        vehicleList.add("Suzuki Bolan");
    }

    public List<String> getVehicleList() {
        return vehicleList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> tempList = new ArrayList<>();
        for(String val : this.vehicleList){
            tempList.add(val);
        }
        return new Vehicle(tempList);
    }

}
