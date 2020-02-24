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
public class BirdSighting {
    private String especie;
    private Integer dia;
    private Integer mes;
    private Integer cantidad;
    public BirdSighting(){
    this.especie="robin";
    this.dia=1;
    this.cantidad=1;
    }
public BirdSighting(String e1, Integer c1,Integer d1){
    this.especie=e1;
    this.cantidad=c1;
    this.dia=d1;
    System.out.println(e1+" "+c1);
     Integer d2;
    if(d1<=31){
        System.out.println(d1+" "+"enero");
    }else if(d1<=59){
        d2=d1-31;
        System.out.println(d2+" "+"febrero");
    }else if(d1<=90){
        d2=d1-59;
        System.out.println(d2+" "+"marzo");
        
    }else if(d1<=120){
        d2=d1-90;
        System.out.println(d2+"abril");
    }else if(d1<=151){
        d2=d1-120;
        System.out.println(d2+"mayo");
    }else if(d1<=181){
        d2=d1-151;
        System.out.println(d2+"junio");
    }else if(d1<=212){
        d2=d1-181;
        System.out.println(d2+"julio");
    }else if(d1<=243){
        d2=d1-212;
        System.out.println(d2+"agosto");
    }else if(d1<=273){
        d2=d1-243;
        System.out.println(d2+"septiembre");
    }else if(d1<=304){
        d2=d1-273;
        System.out.println(d2+"octubre");
    }else if(d1<=334){
        d2=d1-304;
        System.out.println(d2+"noviembre");
    }else if(d1<=365){
        d2=d1-334;
        System.out.println(d2+"diciembre");
    }
}
    public String getEspecie() {
        return especie;
    }

    public Integer getDia() {
        return dia;
    }

    public Integer getCantidad() {
        return cantidad;
    }
    
}
