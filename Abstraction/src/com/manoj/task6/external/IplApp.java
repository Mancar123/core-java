package com.manoj.task6.external;

import com.manoj.task6.Jdbc;

public class IplApp
{
   private Jdbc jdbc;
   public  IplApp(Jdbc jdbc){
       System.out.println("running in ipl app");
       this.jdbc=jdbc;
   }
   public void saveinfo(){
       if(jdbc!=null){
           jdbc.save();
       }
       else{
           System.out.println("jdbc is null");
       }

}
}
