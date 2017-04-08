/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author johit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date b=new Date(7,8,1999);
        Persona j=new Persona("Johan",b);
        System.out.println(j);
        System.out.println("Nacio en " + b.getAño());
        j.imprimirbisciesto();
        System.out.println("era un "+b.getNombredia(5));
    }
    
}
