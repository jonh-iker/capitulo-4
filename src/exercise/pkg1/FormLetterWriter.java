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
public class FormLetterWriter {
    private String lastname;
    private String firstname;
    public void displaySaludation(String lastname){
        this.lastname= lastname;
        System.out.println("Mr.or Ms" +" "+ this.lastname);
        System.out.println("thank you for your recent order");
        
    }
    public void displaySaludation(String firstname, String lastname){
        this.firstname= firstname;
        this.lastname= lastname;
        System.out.println("Dear" +" " + this.firstname +" " + this.lastname );
        System.out.println("thank you for your recent order");
    }
}