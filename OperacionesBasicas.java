/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operaciones.basicas;
import java.util.Scanner;
/**
 *
 * @author Alfredo
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner reader = new Scanner(System.in);
      
     char opcion;
  
     
     System.out.println("elige una operacion basica:");
     System.out.println("suma: a");
     System.out.println("multiplicacion: b");
     System.out.println("resta: c");
     System.out.println("division: d");
     System.out.println("residuo o modulo e");
    opcion  = reader.next().charAt(0);
    
    
     switch(opcion)
     {
         case 'a':
             int numero1 = 5;
             int numero2 = 10;
             int resultado = 0;

	
                System.out.println("primer atributo: "+numero1);			
                System.out.println("primer atributo: "+numero2);
			
              
                

                resultado = numero1+numero2;

                System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
                
             break; 
             
         case 'b':
             
             int mult1 = 8;
             int mult2 = 16;
             int res1 = 0;

	
               System.out.println("primer atributo: "+mult1);
               System.out.println("primer atributo: "+mult2);

                res1 = mult1*mult2;

                System.out.println("La multiplicacion es " + mult1 + " * " + mult2 + " = " + res1);
             break;
             
         case 'c':
             int rest = 125;
             int rest2 = 50;
             int res2 = 0;

	
                System.out.println("primer atributo: "+rest);
               System.out.println("primer atributo: "+rest2);

                res2 = rest-rest2;

                System.out.println("La resta es " + rest + " - " + rest2 + " = " + res2);
             break;
             
         case 'd':
              int div = 1500;
             int div1 = 5;
             int res3 = 0;

	
              System.out.println("primer atributo: "+div);
               System.out.println("primer atributo: "+div1);

                res3 = div/div1;

                System.out.println("La division es " + div + " / " + div1 + " = " + res3);
             break;
             
         case 'e':
             
             double residuo = 25;
             double residuo2 = 7;
             double resultadof = 0;
             
             
              System.out.println("primer atributo: "+residuo);
               System.out.println("primer atributo: "+residuo2);
               
               
             resultadof = residuo%residuo2;
             
             System.out.println("el residuo o modulo es "+residuo+" % "+residuo2+" = "+resultadof);
             
             
             break;
             
             
     }
     

    }
    
}
