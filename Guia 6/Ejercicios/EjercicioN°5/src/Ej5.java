
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
/**
 *
 * @author Usuario
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
       
        double numero, doble, triple, raizcuadrada;
        
             
        System.out.println("Ingrese un numero Entero");
        
        numero = leer.nextDouble();
        
        doble = numero*2;
        triple = numero*3;
        raizcuadrada= Math.sqrt(numero);
        
        System.out.println("El Doble es: "+doble+" El Triple es: "+triple+ " La Raiz Cuadrada es: "+raizcuadrada);
        
        
        
               
        
        
        
    }
    
}
