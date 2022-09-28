
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Crear un programa que dado un numero determine si es par o impar.*/
/**
 *
 * @author Usuario
 */
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner (System.in);
       
        int numero;
        
             
        System.out.println("Ingrese un numero Entero");
        
        numero = leer.nextInt();
        
        if (numero %2 == 0){
        
        System.out.println("El Numero " +numero+ " es par");
    }
        else {
     
        
        System.out.println("El numero " +numero+ " es impar");
        
        
        }
        
        
    
    
    
    
    
}
}