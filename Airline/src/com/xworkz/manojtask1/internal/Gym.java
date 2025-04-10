package com.xworkz.manojtask1.internal;

public class Gym {
        private String name = "Iron Fitness";
        private int members = 150;
        private String specialty = "Weightlifting";
        private boolean isOpen = true;
        private double size = 500.0;

        void setName(String name) {
            this.name = name;
        }

        void setMembers(int members) {
            this.members = members;
        }

        void setSpecialty(String specialty) {
            this.specialty = specialty;
        }

        void setOpen(boolean isOpen) {
            this.isOpen = isOpen;
        }

        void setSize(double size) {
            this.size = size;
        }

        public void getName() {
            System.out.println(name);
        }

        public void getMembers() {
            System.out.println(members);
        }

        public void getSpecialty() {
            System.out.println(specialty);
        }

        public void getOpen() {
            System.out.println(isOpen);
        }

        public void getSize() {
            System.out.println(size);
        }
    }


