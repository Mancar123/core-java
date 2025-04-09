package com.xworkz.manojtask1.internal;

public class Keychain {
        private String material = "Metal";
        private int keyCount = 5;
        private String owner = "Manoj";
        private boolean isCustomized = true;
        private double weight = 0.15;

        void setMaterial(String material) {
            this.material = material;
        }

        void setKeyCount(int keyCount) {
            this.keyCount = keyCount;
        }

        void setOwner(String owner) {
            this.owner = owner;
        }

        void setCustomized(boolean isCustomized) {
            this.isCustomized = isCustomized;
        }

        void setWeight(double weight) {
            this.weight = weight;
        }

        public void getMaterial() {
            System.out.println(material);
        }

        public void getKeyCount() {
            System.out.println(keyCount);
        }

        public void getOwner() {
            System.out.println(owner);
        }

        public void getCustomized() {
            System.out.println(isCustomized);
        }

        public void getWeight() {
            System.out.println(weight);
        }
    }


