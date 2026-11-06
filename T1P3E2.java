package Sedlak_Kiril1;

public class T1P3E2 {

    
    public static void main(String[] args) {
        
        
        int temperaturas[]=new int [20];
        
        for (int i = 0;i<temperaturas.length;i++) {
            temperaturas [i] = (int)(Math.random()*61-15);
        }
        
        String res="";
        
        for (int i = 0;i<temperaturas.length;i++) {
            res +=temperaturas[i];
            if (i < temperaturas.length-1) { //Quitamos menos uno para hacer que no ponga coma en el ultimo
                res +=",";
            }
        }
        
        System.out.println("Mostrando arrays de temperaturas:");
        System.out.println(res);
        
        System.out.println(" ");
        
        int maxima = temperaturas [0];
        int minima = temperaturas [0];
        int dias = 0;
        int suma = 0;
        
        for (int i = 0;i<temperaturas.length;i++) {
            if(temperaturas[i] >= maxima){ //Ponemos igual para que se quede con el ultimo numero maximo
                maxima = temperaturas [i]; 
            }
            if(temperaturas[i] <= minima){ //Ponemos igual para que se quede con el ultimo numero minimo
                minima = temperaturas [i];
            }
            if(temperaturas[i]>30){ //Cuando supera 30 grados el contador de dias sube
                dias++;
            }
        }
        
        for (int i = 0; i < temperaturas.length; i++) {
            suma = suma + temperaturas[i];
        }
        double media = suma / temperaturas.length;
        
        System.out.println("Temperatura maxima: "+maxima);
        System.out.println("Temperatura minima: "+minima);
        System.out.println("Dias por encima de 30 grados: "+dias);
        System.out.println("Temperatura media: "+media);
    }
    
}
