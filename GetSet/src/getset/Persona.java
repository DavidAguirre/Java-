/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package getset;

/**
 *
 * @author Uvi
 */
public class Persona {

    private String nombre ;
    private String apellido;
    private int edad ;
    private int peso;
    private int altura;

    //constructor
    public Persona(String nombre, String apellido, int edad, int peso, int altura){
        this.nombre =nombre;
        this.apellido =apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    //cremos metodo get

    public String getNombre (){
      return nombre;
    }
     public String getApellido(){
      return apellido;
     }
     public int getEdad(){
     return edad;
     }
     public int getPeso(){
     return peso;
     }
     public int getAltura(){
     return altura;
     }
    // metodo set  o asignar

     public void setNombre(String nombre){
     this.nombre =nombre;
     }
     public void setApellido(String apellido){
     this.apellido=apellido;
    }
     public void setEdad(int edad){
     this.edad =edad;
     }
     public void setPeso (int peso){
     this.peso = peso;
     }
     public void setAltura(int altura){
     this.altura =altura;
     }


}

