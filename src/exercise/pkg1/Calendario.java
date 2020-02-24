/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;

import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author jonhy
 */
public class Calendario {
    
    public void sacarfecha(){
      Calendar c1=GregorianCalendar.getInstance();
      Integer d=c1.getTime().getDate();
      Integer m=c1.getTime().getMonth()+1;
      Integer y=c1.getTime().getYear()+1900;
      Integer r;
        System.out.println(d+" "+m+" "+y);
        System.out.println("dias para el sig.mes:");
      switch(m){
          case 1:
              r=31-d;
              System.out.println(r);
              break;
          case 2:
              r=29-d;
              System.out.println(r);
              break;
          case 3:
              r=31-d;
              System.out.println(r);
              break;
          case 4:
              r=30-d;
              System.out.println(r);
              break;
          case 5:
              r=31-d;
              System.out.println(r);
              break;
          case 6:
              r=30-d;
              System.out.println(r);
              break;
          case 7:
              r=31-d;
              System.out.println(r);
              break;
          case 8:
              r=31-d;
              System.out.println(r);
              break;
          case 9:
              r=30-d;
              System.out.println(r);
              break;
          case 10:
              r=31-d;
              System.out.println(r);
              break;
          case 11:
              r=30-d;
              System.out.println(r);
              break;
          case 12:
             r= 31-d;
             System.out.println(r);
              break;
          
      }
      
    }
    public void sacaryear(){
    Calendar c2=new GregorianCalendar();
    Integer m=c2.getTime().getMonth()+1;
    Integer r;
    Integer d=c2.getTime().getDate();
        System.out.println("faltan:");
     switch(m){
          case 1:
              r=365-d;
              System.out.println(r);
              break;
          case 2:
              r=365-d+31;
              System.out.println(r);
              break;
          case 3:
              r=365-d+60;
              System.out.println(r);
              break;
          case 4:
              r=365-d+91;
              System.out.println(r);
              break;
          case 5:
              r=365-d+121;
              System.out.println(r);
              break;
          case 6:
              r=365-d+152;
              System.out.println(r);
              break;
          case 7:
              r=365-d+182;
              System.out.println(r);
              break;
          case 8:
              r=365-d+213;
              System.out.println(r);
              break;
          case 9:
              r=365-d+244;
              System.out.println(r);
              break;
          case 10:
              r=365-d+274;
              System.out.println(r);
              break;
          case 11:
              r=365-d+305;
              System.out.println(r);
              break;
          case 12:
             r= 365-d+335;
             System.out.println(r);
              break;
          
      }
    }
    public void fechamaturity(){
    Calendar c1=GregorianCalendar.getInstance();
      Integer d=c1.getTime().getDate();
      Integer m=c1.getTime().getMonth()+1;
      Integer y=c1.getTime().getYear()+1901;
      System.out.println(d+" "+m+" "+y);
    }
    public void fechactual(){
    Calendar c1=GregorianCalendar.getInstance();
      Integer d=c1.getTime().getDate();
      Integer m=c1.getTime().getMonth()+1;
      Integer y=c1.getTime().getYear()+1900;
      System.out.println(d+" "+m+" "+y);
    }
}
