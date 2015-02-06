/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploarray;

//import javax.swing.JOptionPane;

/**
 *
 * @author Clases
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Formulario form = new Formulario();
        form.setVisible(true);
        
        
        
        
      /**  for(int i=0;i<arregloColores().length;i++)
        {
           JOptionPane.showMessageDialog(null, "Posicion: "+ i + "\n Valor: "+ arregloColores()[i] );
        }
               
        
        //Declaracion de array tipo String
        String[] arrString = new String[3];
        
        //declaracion de array tipo int
         int[] arrInt = new int[3];
        
        //llenar arrString
        arrString[0] = "uno";
        arrString[1] = "dos";
        arrString[2] = "tres";
        
        //llenar arrInt
        arrInt[0]=1;
        arrInt[1]=2;
        arrInt[2]=3;
        
        for(int i=0; i<arrString.length;i++)
        {
            JOptionPane.showMessageDialog(null, "valor posicion "+ i + " "+ arrString[i] );
        }
        for(int i=0;i<arrInt.length;i++)
        {
            JOptionPane.showMessageDialog(null, "valor posicion "+ i + " "+ arrInt[i] );
        }
        */
               
    }//main
    public static String[] arregloColores()
        {
            String[] arrColores = {"verde", "azul", "blanco"};
            return arrColores;
        }
    
    
}//cierre clase
