
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
/**
 *
 * @author Usuario
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        String Frase;
        
        System.out.println("Ingrese una Frase");

        Frase= leer.nextLine();
        
        System.out.println("La Frase Ingresada es: " + Frase.toUpperCase());
        System.out.println("La Frase Ingresada es: " + Frase.toLowerCase());

        
    
             
    
        
        
    }
    
}
