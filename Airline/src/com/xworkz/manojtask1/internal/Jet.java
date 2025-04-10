package com.xworkz.manojtask1.internal;

public class Jet {
        private String model = "Falcon X";
        private int capacity = 200;
        private String airline = "Sky Airlines";
        private boolean isCommercial = true;
        private double speed = 950.5;

        void setModel(String model) {
            this.model = model;
        }

        void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        void setAirline(String airline) {
            this.airline = airline;
        }

        void setCommercial(boolean isCommercial) {
            this.isCommercial = isCommercial;
        }

        void setSpeed(double speed) {
            this.speed = speed;
        }

        public void getModel() {
            System.out.println(model);
        }

        public void getCapacity() {
            System.out.println(capacity);
        }

        public void getAirline() {
            System.out.println(airline);
        }

        public void getCommercial() {
            System.out.println(isCommercial);
        }

        public void getSpeed() {
            System.out.println(speed);
        }
    }


