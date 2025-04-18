package com.manoj.task4.internal;

import java.util.Objects;

public class KawasakiNinja {
        private String Owner;
        private int price;
        private String biketype;
        private int torque;

        public void setOwner(String Owner){ this.Owner = Owner; }
        public void setPrice(int price){ this.price = price; }
        public void setBiketype(String biketype){ this.biketype = biketype; }
        public void setTorque(int torque){ this.torque = torque; }

        public String toString(){
            System.out.println("running toString in KawasakiNinja");
            return "Owner:" + this.Owner + ", price:" + this.price + ", bikeType:" + this.biketype + ", torque:" + this.torque;
        }

        public boolean equals(Object obj){
            if(obj != null && obj instanceof KawasakiNinja){
                KawasakiNinja k = (KawasakiNinja)obj;
                if(Objects.equals(k.Owner, this.Owner)){
                    System.out.println("KawasakiNinja bike is matching");
                    return true;
                }
            }
            return false;
        }

}
