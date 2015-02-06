/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package asignaenteros1;

/**
 *
 * @author Uvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        byte mini =(byte)82;
        short enteroCorto = 23000;
        int millon = 2300000;
        long cienMillon = 222333444;

        System.out.println("este numero imprimira el byte "+mini);
        System.out.println("este numero imprimira el entero corto "+enteroCorto );
        System.out.println("este numero imprimira el millon "+millon);
        System.out.println("este numero imprimira el cienmillon "+cienMillon);
        System.out.println((mini <= 87)?"tiene 87 o menos":"tiene 88 0 mas");

       switch (mini){
           case 87:
               System.out.println("es 87 PUTO");
               break;
           case 88:
                System.out.println("es 88 PUTO");
                break;
            default:

                 System.out.println("no es ningun numero similar");
        }

          if (mini>=87){
              System.out.println("pasai conchetumare");
                }
           else if(mini<87) {

               System.out.println("no pasai ni cagando culiao");
          }


        }
        // TODO code application logic here
    }


