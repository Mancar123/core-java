package com.manoj.task4.internal;

import java.util.Objects;

public class Q5 {
        private String Owner;
        private int price;
        private String cartype;
        private int torque;

        public void setOwner(String Owner){ this.Owner = Owner; }
        public void setPrice(int price){ this.price = price; }
        public void setCartype(String cartype){ this.cartype = cartype; }
        public void setTorque(int torque){ this.torque = torque; }

        public String toString(){
            System.out.println("running toString in Q5");
            return "Owner:" + this.Owner + ", price:" + this.price + ", carType:" + this.cartype + ", torque:" + this.torque;
        }

        public boolean equals(Object obj){
            if(obj != null && obj instanceof Q5){
                Q5 q = (Q5)obj;
                if(Objects.equals(q.Owner, this.Owner)){
                    System.out.println("Q5 car is matching");
                    return true;
                }
            }
            return false;
        }

}
