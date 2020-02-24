/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;


public class patient {
    private Bloodtype sangre;
    private Rh factor;
    private Integer id;
    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSangre(Bloodtype sangre) {
        this.sangre = sangre;
    }

    public void setFactor(Rh factor) {
        this.factor = factor;
    }

    public Bloodtype getSangre() {
        return sangre;
    }

    public Rh getFactor() {
        return factor;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

   
    
    public patient(){
    this.id=0;
    this.age=0;
    this.sangre=Bloodtype.O;
    this.factor=Rh.POSITIVO;
    }
    public patient(Integer i,Integer a,Bloodtype t1,Rh r1){
    this.id=i;
    this.age=a;
    this.sangre=t1;
    this.factor=r1;
    }
}
