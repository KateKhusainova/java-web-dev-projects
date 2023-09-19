package org.launchcode;
import java.util.HashMap;

public abstract class BaseDisc {
    //variables:
    private String discData;
    private HashMap<String, String> discInfo;
    private final int storageCapacity;
    private final int spinSpeed;
    private boolean isInserted;

    //constructor


    public BaseDisc(String discData, HashMap<String, String> discInfo, int storageCapacity, int spinSpeed) {
        this.discData = discData;
        this.discInfo = discInfo;
        this.storageCapacity = storageCapacity;
        this.spinSpeed = spinSpeed;
        this.discInfo.put("Storage Capacity", String.valueOf(storageCapacity));
        this.discInfo.put("Spin Speed", String.valueOf(spinSpeed));
    }

   //Getters and setters

    public boolean isInserted() {
        return isInserted;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }
    public void writeData(String data) {
        this.discData +=data;
    }
    public String readData() {
        return this.discData;
    }
    public HashMap<String, String> getInfo() {return this.discInfo;}
    public void insert() {
        this.isInserted = true;
    }
}
