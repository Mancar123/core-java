package com.xworkz.manojtask1.internal;

public class Postoffice {

        private String location = "Bengaluru";
        private int officeCode = 560001;
        private String postmaster = "Ravi";
        private boolean isOperational = true;
        private double areaSize = 250.5;

        void setLocation(String location) {
            this.location = location;
        }

        void setOfficeCode(int officeCode) {
            this.officeCode = officeCode;
        }

        void setPostmaster(String postmaster) {
            this.postmaster = postmaster;
        }

        void setOperational(boolean isOperational) {
            this.isOperational = isOperational;
        }

        void setAreaSize(double areaSize) {
            this.areaSize = areaSize;
        }

        public void getLocation() {
            System.out.println(location);
        }

        public void getOfficeCode() {
            System.out.println(officeCode);
        }

        public void getPostmaster() {
            System.out.println(postmaster);
        }

        public void getOperational() {
            System.out.println(isOperational);
        }

        public void getAreaSize() {
            System.out.println(areaSize);
        }
    }


