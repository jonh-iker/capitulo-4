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
public class Bread {
    private String pan;
    private Integer calorias;

    public Integer getCalorias() {
        return calorias;
    }

    public String getPan() {
        return pan;
    }
    public final static String MOTTO="the staff of life";
            
    public Bread(String p1,Integer c1){
    this.calorias=c1;
    this.pan=p1;
        System.out.println(MOTTO);
        System.out.println("tipo de pan:"+p1+" "+"calorias:"+c1);
        
        
    }
}
