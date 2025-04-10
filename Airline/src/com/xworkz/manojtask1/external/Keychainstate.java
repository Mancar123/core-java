package com.xworkz.manojtask1.external;

import com.xworkz.manojtask1.internal.Keychain;

public class Keychainstate {
    public void chain(){
        System.out.println("Keychain Details");
        Keychain keyChains = new Keychain();
        keyChains.getMaterial();
        keyChains.getKeyCount();
        keyChains.getOwner();
        keyChains.getCustomized();
        keyChains.getWeight();

    }
}
