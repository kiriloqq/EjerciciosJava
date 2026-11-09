package EJERCICIOSIMP;

//Escribe un programa que controle el acceso a una atracción. Se irán introduciendo las edades de los visitant...
//Por cada visitante:
//- Si la edad es menor de 12 años, el billete cuesta 5 euros.
//- Si la edad está entre 12 y 65 años, el billete cuesta 10 euros.
//- Si es mayor de 65 años, la entrada es gratuita (0 euros).
//Al terminar (al meter -1), debe indicar la recaudación total del día y la cantidad de niños (menores de 12 añ...
import java.util.Scanner;
public class ejer5 {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int edad;
        int ninos = 0;
        double recaudacion = 0;

        System.out.print("Introduce la edad (-1 para terminar): ");
        edad = teclado.nextInt();

        while (edad != -1) {
            if (edad < 0) {
                System.out.println("Edad no valida.");
            } else if (edad < 12) {
                recaudacion = recaudacion + 5;
                ninos++;
            } else if (edad <= 65) {
                recaudacion = recaudacion + 10;
            } else {
                System.out.println("Entrada gratuita.");
            }

            System.out.print("Introduce otra edad (-1 para terminar): ");
            edad = teclado.nextInt();
        }

        System.out.println("Recaudacion total: "
                + recaudacion + " euros");
        System.out.println("Cantidad de ninos: " + ninos);

        teclado.close();
    }
    
}
