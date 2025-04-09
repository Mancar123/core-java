package com.xworkz.manojtask1.internal;

public class Badge {
        private String design = "Gold";
        private int idNumber = 1001;
        private String owner = "Manoj";
        private boolean isOfficial = true;
        private double size = 5.5;

        void setDesign(String design) {
            this.design = design;
        }

        void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
        }

        void setOwner(String owner) {
            this.owner = owner;
        }

        void setOfficial(boolean isOfficial) {
            this.isOfficial = isOfficial;
        }

        void setSize(double size) {
            this.size = size;
        }

        public void getDesign() {
            System.out.println(design);
        }

        public void getIdNumber() {
            System.out.println(idNumber);
        }

        public void getOwner() {
            System.out.println(owner);
        }

        public void getOfficial() {
            System.out.println(isOfficial);
        }

        public void getSize() {
            System.out.println(size);
        }
    }


