package com.manoj.task4.internal;

import java.util.Objects;

public class DucatiPanigale {
        private String Owner;
        private int price;
        private String biketype;
        private int torque;

        public void setOwner(String Owner){ this.Owner = Owner; }
        public void setPrice(int price){ this.price = price; }
        public void setBiketype(String biketype){ this.biketype = biketype; }
        public void setTorque(int torque){ this.torque = torque; }

        public String toString(){
            System.out.println("running toString in DucatiPanigale");
            return "Owner:" + this.Owner + ", price:" + this.price + ", bikeType:" + this.biketype + ", torque:" + this.torque;
        }

        public boolean equals(Object obj){
            if(obj != null && obj instanceof DucatiPanigale){
                DucatiPanigale d = (DucatiPanigale)obj;
                if(Objects.equals(d.Owner, this.Owner)){
                    System.out.println("DucatiPanigale bike is matching");
                    return true;
                }
            }
            return false;
        }

}
