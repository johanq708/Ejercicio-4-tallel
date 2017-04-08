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
public class Persona {
    private String nombre;
    private Date birthdate;

    public Persona(String nombre,Date birthdate) {
        this.nombre = nombre;
        this.birthdate = birthdate;
    }
    
    public void imprimirbisciesto(){
        if(birthdate.bisciesto(birthdate.getAño())==true){
            System.out.println("Era un año bisciesto");
        }else{
            System.out.println("No era un año bisciesto");
        }
    }
    @Override
    public String toString() {
        return nombre+" cumple años el "+birthdate.getDia()+" de "+birthdate.getNombremes(birthdate.getMes());
    }
    
}
