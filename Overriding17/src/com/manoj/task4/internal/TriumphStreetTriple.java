package com.manoj.task4.internal;

import java.util.Objects;

public class TriumphStreetTriple {
        private String Owner;
        private int price;
        private String biketype;
        private int torque;

        public void setOwner(String Owner){ this.Owner = Owner; }
        public void setPrice(int price){ this.price = price; }
        public void setBiketype(String biketype){ this.biketype = biketype; }
        public void setTorque(int torque){ this.torque = torque; }

        public String toString(){
            System.out.println("running toString in TriumphStreetTriple");
            return "Owner:" + this.Owner + ", price:" + this.price + ", bikeType:" + this.biketype + ", torque:" + this.torque;
        }

        public boolean equals(Object obj){
            if(obj != null && obj instanceof TriumphStreetTriple){
                TriumphStreetTriple t = (TriumphStreetTriple)obj;
                if(Objects.equals(t.Owner, this.Owner)){
                    System.out.println("TriumphStreetTriple bike is matching");
                    return true;
                }
            }
            return false;
        }

}
