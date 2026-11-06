package Sedlak_Kiril1;

import java.util.Scanner;

public class T1P3E1 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numeros[]=new int [10];
        int numIntroducida = 0;
        
        for (int i = 0;i<numeros.length;i++) {
            numeros [i] = (int)(Math.random()*46+5); //Ponemos numeros aleatorios en la lista entre 5 y 50 
        }
        
        System.out.println("Array de valores creado...");
        
        do {
                System.out.print("Introduzca un tamano entre 5 y 50: ");
                numIntroducida = teclado.nextInt();
                if ((numIntroducida < 5 )||(numIntroducida > 50 )){ //Si no esta en rango que salga error
                    System.out.println("Error. El numero introducido no esta en el rango indicado");
                }
            } while ((numIntroducida < 5 )||(numIntroducida > 50 ));
        
        int contador = 0;
        int posicion = 0;       
        
        for (int i = 0; i < numeros.length; i++) {
            if ((numeros[i] == numIntroducida)) { //Para conocer su primera posicion
                contador++;
                if (contador == 1){
                posicion = i+1;           
                }
            }                   
        }
        
        System.out.println(" ");
        
        
        if (contador > 0) {
            System.out.println("El numero " + numIntroducida + " ESTA EN EL ARRAY y su primera posicion es la " + posicion);
        } else {
            System.out.println("El numero " + numIntroducida + " NO ESTA EN EL ARRAY");
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
         
    }
    
}
