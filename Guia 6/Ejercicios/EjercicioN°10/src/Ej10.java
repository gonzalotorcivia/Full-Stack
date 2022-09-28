
/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/


import java.util.Scanner;

public class Ej10 {

    
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESAR EL LIMITE");
        
        int lim = leer.nextInt();
        
        int suma = 0;
        
        do
        {
            System.out.println("INGRESAR UN NUMERO");
            
            int num = leer.nextInt();
            
            suma = num + suma;

        } 
        
        while (suma <= lim);
        
        System.out.println("LA suma de los numero ingresados es: "+suma);
        
   
    }

}    
        
        
        
        
        
        
        
        
        
        
       
       
        
        
    
 