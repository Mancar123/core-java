package com.manoj.task4.internal;

import java.util.Objects;

public class ChevroletCruze {
        private String Owner;
        private int price;
        private String cartype;
        private int torque;

        public void setOwner(String Owner){ this.Owner = Owner; }
        public void setPrice(int price){ this.price = price; }
        public void setCartype(String cartype){ this.cartype = cartype; }
        public void setTorque(int torque){ this.torque = torque; }

        public String toString(){
            System.out.println("running toString in ChevroletCruze");
            return "Owner:" + this.Owner + ", price:" + this.price + ", carType:" + this.cartype + ", torque:" + this.torque;
        }

        public boolean equals(Object obj){
            if(obj != null && obj instanceof ChevroletCruze){
                ChevroletCruze c = (ChevroletCruze)obj;
                if(Objects.equals(c.Owner, this.Owner)){
                    System.out.println("ChevroletCruze car is matching");
                    return true;
                }
            }
            return false;
        }

}
