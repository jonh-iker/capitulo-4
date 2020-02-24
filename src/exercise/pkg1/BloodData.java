/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;


public class BloodData {
    private Bloodtype tipo;
    private Rh factor;

    public void setTipo(Bloodtype tipo) {
        this.tipo = tipo;
    }

    public void setFactor(Rh factor) {
        this.factor = factor;
    }

    public Bloodtype getTipo() {
        return tipo;
    }

    public Rh getFactor() {
        return factor;
    }
    
    public BloodData(){
        this.tipo=Bloodtype.O;
        this.factor=Rh.POSITIVO;
    }
    public BloodData(Bloodtype t1,Rh r1){
    this.tipo=t1;
    this.factor=r1;
    }
}

