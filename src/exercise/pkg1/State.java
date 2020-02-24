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
public class State extends City{
    private String nombre;
    private Integer total;
    private City capital;
    private City ciudad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTotal() {
        return total;
    }
    
    public State(String s1 ,String c1 ,String p1 ,Integer t1 ,Integer t2, Integer t3 ){
        this.nombre=s1;
        this.total=t1;
        City a=new City();
        a.setName(c1);
        a.setPoblacion(t2);
        City b=new City();
        b.setName(p1);
        b.setPoblacion(t3);
        
        System.out.println(this.nombre+" "+this.total+" "+a.getName()+" "
        +a.getPoblacion()+" "+b.getName()+" "+b.getPoblacion());
    
    }
    
 
}
