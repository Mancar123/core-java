package com.manoj.task6.external;

import com.manoj.task6.Dress;

public class Zarabrand {
    private Dress dress;
    public Zarabrand(Dress dress){
        System.out.println("dress running in zarabrand");
        this.dress=dress;
    }
    public void dressinfo(){
        if(dress!=null){
            dress.quality();
        }
        else{
            System.out.println("dress is null");
        }

    }
}


