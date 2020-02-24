/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;

/**
 *
 * @author jonhy
 */
public class Sandwich {
       private String relleno;
       private Bread pan;

    public String getRelleno() {
        return relleno;
    }

    public Bread getPan() {
        return pan;
    }
       
       public Sandwich(String r1,Bread b1){
       this.relleno=r1;
       this.pan=b1;
           System.out.println(b1.getPan()+" "+b1.getCalorias()+" "+r1);
       }

    
}
