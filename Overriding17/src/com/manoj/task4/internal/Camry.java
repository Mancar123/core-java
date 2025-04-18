package com.manoj.task4.internal;
import java.util.Objects;

public class Camry {
        private String owner;
        private int price;
        private String cartype;
        private int torque;

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setCartype(String cartype) {
            this.cartype = cartype;
        }

        public void setTorque(int torque) {
            this.torque = torque;
        }

        public String toString() {
            System.out.println("running toString in Camry");
            return "Owner: " + this.owner + ", Price: " + this.price + ", Car Type: " + this.cartype + ", Torque: " + this.torque;
        }

        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Camry) {
                Camry col = (Camry) obj;
                if (Objects.equals(col.owner, this.owner)) {
                    System.out.println("Camry car is matching");
                    return true;
                }
            }
            return false;
        }
    }


