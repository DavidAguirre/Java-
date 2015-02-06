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
public class MenuAlumnoMain {

   
    public void PrimerMetodoMain(){
     //optenido de constructor sin parametro
        Alumno alumno = new Alumno();
        
       /** System.out.println("Nombre: " + alumno.nombre+ 
                "\nEdad: "+ alumno.edad + 
                "\nRut: "+ alumno.rut+ "\n");
        
        //optenido de constructor con parametros
        Alumno al = new Alumno ("Mario", 20, "18541224-5");
        
        System.out.println("Los datos del alumno son: \n"+ al.getNombre() +
                "\nEdad: "+al.getEdad()+
                "\nRut: "+al.getRut());
*/    
    }
  
        public static void main(String[] args) {
                       
       //optenido de constructor sin parametro
     Alumno a = new Alumno();           
            
        System.out.println("Nombre: " + a.getNombre() + 
                "\nEdad: "+ a.getEdad() + 
                "\nRut: "+ a.getRut()+ "\n");
        
        //optenido de constructor con parametros
        Alumno al = new Alumno ("Mario", 20, "18541224-5");
        
        System.out.println("Los datos del alumno son: \n"+ al.getNombre() +
                "\nEdad: "+al.getEdad()+
                "\nRut: "+al.getRut()+ "\n Herencia!! \n");
        //herencia 
        AlumnoSuperior as = new AlumnoSuperior("Cristobal", 6, "aun sin rut");
        
            System.out.println("Nombre: "+as.getNombre()+"\nEdad: "+as.getEdad()+ "\nRut: "+ as.getRut());
        as.EntrarAClases();
        as.TomarRamos();
        
        
        }
        
        
        
}
    
