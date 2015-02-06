/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;

/**
 *
 * @author clases
 */
public class Alumno {
    
   private  String nombre;
   private int edad;
   private  String rut;

    //Constructor
    
public Alumno()
{ this.nombre = "Romina";
this.edad = 22;
this.rut = "17980640-1";

}
public Alumno(String nombre, int edad, String rut){
this.nombre = nombre;
this.edad = edad;
this.rut = rut;}

public String getNombre() {
        return nombre;
    }

public int getEdad() {
        return edad;
    }

public String getRut() {
        return rut;
    }

public void setNombre(String nombre) {
        this.nombre = nombre;
    }

public void setEdad(int edad) {
        this.edad = edad;
    }
 
public void setRut(String rut) {
        this.rut = rut;
    }

public void EntrarAClases()
{ System.out.println("El alumno ha entrado a clases");}
public void SalidoDeClases()
{ System.out.println("El alumno ha salido de clases");}

    
    
    
    
    
}//clase alumno
