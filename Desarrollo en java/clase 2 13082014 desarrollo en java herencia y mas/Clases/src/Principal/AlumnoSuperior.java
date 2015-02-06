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
public class AlumnoSuperior extends Alumno{
    
    //constructor
     public AlumnoSuperior (String nombre, int edad, String rut)
    {super (nombre, edad, rut);}
    
     
     
        public void TomarRamos()
    { System.out.println("Tomé Ramos ");}
    
}
