package com.xworkz.manojtask1.internal;

public class Keychainrunner {
    public void keychain2() {
        System.out.println("Keychain Details");
        Keychain keyChain = new Keychain();
        keyChain.setMaterial("Leather");
        keyChain.setKeyCount(3);
        keyChain.setOwner("Manoj");
        keyChain.setCustomized(true);
        keyChain.setWeight(0.12);
        keyChain.getMaterial();
        keyChain.getKeyCount();
        keyChain.getOwner();
        keyChain.getCustomized();
        keyChain.getWeight();
    }

}
