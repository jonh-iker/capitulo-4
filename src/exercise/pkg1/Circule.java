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

public class Circule {
    private double radio;
    private double diametro;
    private double area;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getArea() {
        return area;
    }
    
    public Circule(){
    this.radio=1;
    this.diametro=this.radio*2;
    this.area=Math.pow(this.radio,2)*Math.PI;
        System.out.println(this.radio+" "+this.diametro+" "+this.area);
    }
    public Circule(double r1){
    this.radio=r1;
    this.diametro=this.radio*2;
    this.area=Math.pow(r1,2)*Math.PI;
            System.out.println(this.radio+" "+this.diametro+" "+this.area);

    }
}
