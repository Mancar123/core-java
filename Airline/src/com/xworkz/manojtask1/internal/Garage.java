package com.xworkz.manojtask1.internal;

public class Garage {
        private String location = "Downtown";
        private int capacity = 50;
        private String owner = "Manoj";
        private boolean isOpen = true;
        private double area = 200.5;

        void setLocation(String location) {
            this.location = location;
        }

        void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        void setOwner(String owner) {
            this.owner = owner;
        }

        void setOpen(boolean isOpen) {
            this.isOpen = isOpen;
        }

        void setArea(double area) {
            this.area = area;
        }

        public void getLocation() {
            System.out.println(location);
        }

        public void getCapacity() {
            System.out.println(capacity);
        }

        public void getOwner() {
            System.out.println(owner);
        }

        public void getOpen() {
            System.out.println(isOpen);
        }

        public void getArea() {
            System.out.println(area);
        }
    }


