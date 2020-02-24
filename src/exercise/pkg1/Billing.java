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
public class Billing {
    
    
    public void computeBill(Integer p1){
        Double p2;
        p2=p1*1.08;
        System.out.println(p2);
    }
    public void computeBill(Integer p1,Integer c1){
    Integer p2;
    p2=p1*c1;
    Double total;
    total=p2*1.08;
        System.out.println(total);
    }
    public void computeBill(Integer p1,Integer c1,Integer c2){
    Integer p2,p4;
    Double p3;
    p2=p1*c1;
    p4=p2-c2;
    p3=p4*1.08;
        System.out.println(p3);
    
    }
}
