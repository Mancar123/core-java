package com.manoj.task4.internal;
import java.util.Objects;

public class Corolla {
        private String owner;
        private int price;
        private String cartype;
        private int torque;

        public void setOwner(String owner){
            this.owner = owner;
        }
        public void setPrice(int price){
            this.price = price;
        }
        public void setCartype(String cartype){
            this.cartype = cartype;
        }
        public void setTorque(int torque){
            this.torque = torque;
        }

        public String toString(){
            System.out.println("running toString in Corolla");
            return "Owner: " + this.owner + ", Price: " + this.price + ", Car Type: " + this.cartype + ", Torque: " + this.torque;
        }

        public boolean equals(Object obj){
            if (obj != null && obj instanceof Corolla){
                Corolla col = (Corolla) obj;
                if(Objects.equals(col.owner, this.owner)){
                    System.out.println("Corolla car is matching");
                    return true;
                }
            }
            return false;
        }
    }

