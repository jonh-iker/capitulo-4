/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;

import java.util.GregorianCalendar;

/**
 *
 * @author jonhy
 */
public class CertificateOfDeposit extends Calendario {
    private Integer numcertificado;
    private String apellido;
    private Integer balance;
   

    public void setNumcertificado(Integer numcertificado) {
        this.numcertificado = numcertificado;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void Issuedate() {
        Calendario c1=new Calendario();
        c1.fechactual();
    }

    public void Maturitydate() {
       Calendario c1=new Calendario();
       c1.fechamaturity();
    }
   

    public Integer getNumcertificado() {
        return numcertificado;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getBalance() {
        return balance;
    }

   
   
}
