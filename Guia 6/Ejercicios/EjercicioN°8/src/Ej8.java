
import java.util.Scanner;

/*Realizar un programa que solo permita introducir frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/

public class Ej8 {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner (System.in);
       
        String frase;
        int n;          
                        
        System.out.println("Ingrese una Frase de 8 Caracteres de Largo");
        
        frase = leer.next();
          
        n = frase.length();
        
       if (n==8)
       
            
            System.out.println("CORRECTO");
        
       else
            
            System.out.println("INCORRECTO");
            
        
        
    
    
    }
    
}
