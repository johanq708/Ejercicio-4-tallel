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
public class Date {
    private int dia;
    private int mes;
    private int año;
    private String[] nombredia;
    private String[] nombremes;

    public Date(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.nombredia = new String[7];
        this.nombredia[0]="Lunes";
        this.nombredia[1]="Martes";
        this.nombredia[2]="Miercoles";
        this.nombredia[3]="Jueves";
        this.nombredia[4]="Viernes";
        this.nombredia[5]="Sabado";
        this.nombredia[6]="Domingo";
        this.nombremes = new String[12];
        this.nombremes[0]="Enero";
        this.nombremes[1]="Febrero";
        this.nombremes[2]="Marzo";
        this.nombremes[3]="Abril";
        this.nombremes[4]="Mayo";
        this.nombremes[5]="Junio";
        this.nombremes[6]="Julio";
        this.nombremes[7]="Agosto";
        this.nombremes[8]="Septiembre";
        this.nombremes[9]="Octubre";
        this.nombremes[10]="Noviembre";
        this.nombremes[11]="Diciembre";
    }
    
    public boolean bisciesto(int a){
        if (a%4==0){
            return true;
        }else{
            return false;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public String getNombredia(int d) {
        return nombredia[d];
    }

    public String getNombremes(int m) {
        return nombremes[m-1];
    }

    @Override
    public String toString() {
        return "el dia" + dia + " de " + año;
    } 
    
    
}
