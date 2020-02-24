/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Exercise1 {

   
    public static void main(String[] args) {
        //1
        FormLetterWriter uno;
        uno=new FormLetterWriter();
        uno.displaySaludation("perez");
        uno.displaySaludation("pedro", "hernandez");
        System.out.println("\n");
        //2
        Billing p1=new Billing();
        p1.computeBill(500);
        p1.computeBill(100,2);
        p1.computeBill(100,2,50);
                System.out.println("\n");

        //3
        BirdSighting b1=new BirdSighting();
        System.out.println("especie:" +b1.getEspecie() +" " +"dia:" +b1.getDia() +" " +"cantidad:" +b1.getCantidad());
        BirdSighting pajaro=new BirdSighting("gorrion",5,256);
                System.out.println("\n");

        //4
        BloodData s1=new BloodData();
        System.out.println(s1.getTipo()+" "+s1.getFactor());
        BloodData s2=new BloodData(Bloodtype.AB,Rh.NEGATIVO);
        System.out.println(s2.getTipo()+" "+s2.getFactor());
        patient v1=new patient();
        
        System.out.println(v1.getId()+" "+v1.getAge()+" "+v1.getSangre()+" "+v1.getFactor());
        patient v2=new patient(12,20,Bloodtype.AB,Rh.NEGATIVO);
        System.out.println(v2.getId()+" "+v2.getAge()+" "+v2.getSangre()+" "+v2.getFactor());
                System.out.println("\n");

        //5
        Bread pn1=new Bread("integral",179);
        Sandwich sub=new Sandwich("pizza",pn1);
                System.out.println("\n");

      //6
      Circule redondo=new Circule();
      Circule redondo1=new Circule(4.0);
              System.out.println("\n");

      //7
        System.out.println("la raiz de 37 es:"+Math.sqrt(37)); 
        double resul;
        resul=(Math.PI*300)/180;
        System.out.println("el seno de 300 es:"+Math.sin(resul)+" "+"el coseno de 300 es:"+Math.cos(resul));
        System.out.println("floor:"+Math.floor(22.8)+" "+"ceiling"+Math.ceil(22.8)+" "+"round"+Math.round(22.8));
        System.out.println("el mas grande es:"+Math.max('D',71)+" "+"el mas pequeño es:"+Math.min('D',71));
        double aux;
        aux=Math.random()*19+1;
        aux=Math.round(aux);
        System.out.println(aux);
                System.out.println("\n");

        //8
        Calendario fecha1=new Calendario();
        fecha1.sacarfecha();
                System.out.println("\n");

        //9
        Calendario fecha2=new Calendario();
        fecha2.sacaryear();
                System.out.println("\n");

        //
        CertificateOfDeposit cd1=new CertificateOfDeposit();
        cd1.setNumcertificado(12345);
        cd1.setApellido("rodrigez");
        cd1.setBalance(2500);
        System.out.println("num.certificado:"+cd1.getNumcertificado());
        System.out.println("apellido:"+cd1.getApellido());
        System.out.println("balance:"+cd1.getBalance());
        System.out.println("issue date:");
        cd1.Issuedate();
        System.out.println("maturity date");
        cd1.Maturitydate();
                System.out.println("\n");
        //
       State estado=new State("oaxaca", "oaxaca", "mitla",123,456,789);
       
           
        }
        
        
    }
    
    


