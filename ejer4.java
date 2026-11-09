package EJERCICIOSIMP;

//Ejercicio 4: Tarifa de alquiler de patinetes
//Realiza un programa que calcule el coste del alquiler de un patinete eléctrico solicitando los minutos consumidos...
//El precio base por desbloquear el patinete es siempre de 1,50 euros.
//- Si el trayecto dura menos de 15 minutos, cada minuto se cobra a 0,20 euros.
//- Si dura 15 minutos o más, los primeros 15 minutos se cobran a 0,20 euros/min y los minutos restantes a 0,15 eur...
import java.util.Scanner;
public class ejer4 {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int minutos;
        double total = 1.50;

        System.out.print("Introduce los minutos consumidos: ");
        minutos = teclado.nextInt();

        if (minutos < 0) {
            System.out.println("Minutos no validos.");
        } else {
            if (minutos < 15) {
                total = total + minutos * 0.20;
            } else {
                total = total + 15 * 0.20;
                total = total + (minutos - 15) * 0.15;
            }

            System.out.printf("Coste total: " + total);
        }

        teclado.close();
    }
    
}
