package com.xworkz.manojtask1.internal;

public class Apartment {
        private String owner = "Manoj";
        private int floorNumber = 5;
        private String type = "Penthouse";
        private boolean isOccupied = true;
        private double area = 1500.5;

        void setOwner(String owner) {
            this.owner = owner;
        }

        void setFloorNumber(int floorNumber) {
            this.floorNumber = floorNumber;
        }

        void setType(String type) {
            this.type = type;
        }

        void setOccupied(boolean isOccupied) {
            this.isOccupied = isOccupied;
        }

        void setArea(double area) {
            this.area = area;
        }

        public void getOwner() {
            System.out.println(owner);
        }

        public void getFloorNumber() {
            System.out.println(floorNumber);
        }

        public void getType() {
            System.out.println(type);
        }

        public void getOccupied() {
            System.out.println(isOccupied);
        }

        public void getArea() {
            System.out.println(area);
        }
    }


