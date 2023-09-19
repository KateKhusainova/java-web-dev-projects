package org.launchcode;

import java.util.HashMap;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String discData, HashMap<String, String> discInfo, int storageCapacity, int spinSpeed) {
        super(discData, discInfo, storageCapacity, spinSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("The spin speed of a CD is " + this.getSpinSpeed());
    }

    @Override
    public void storeData(String data) {
         this.writeData();
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
