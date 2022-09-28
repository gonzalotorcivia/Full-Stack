
import java.util.Scanner;

public class Ej11 {

       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        boolean exit = false;
        
        System.out.println("INGRESAR DOS NUMERO");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
           System.out.println("MENU\n"
                   
                  +" ELIGA UNA OPCION\n" 
                  +" 1.SUMAR\n"
                  +" 2.RESTAR\n"
                  +" 3.MULTIPLICAR\n" 
                  +" 4.DIVIDIR\n"
                  +" 5.SALIR\n" );
           
           do {
            int eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("SUMA = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("RESTA = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("MULTIPLICACION = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("DIVISION = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String confirmacion = leer.next();
                    if (confirmacion.equalsIgnoreCase("s")) {
                       
                        System.out.println("MUCHAS GRACIAS");
                        
                        exit = true;
                        break;
                    } else;
                    
                     System.out.println("MENU\n"
                   
                  +" ELIGA UNA OPCION\n" 
                  +" 1.SUMAR\n"
                  +" 2.RESTAR\n"
                  +" 3.MULTIPLICAR\n" 
                  +" 4.DIVIDIR\n"
                  +" 5.SALIR\n" );
                        
                    break;
                default:
                    System.out.println("LA OPCION INGRESADA NO ES VALIDA");
                    break;
            }
        } 
           
           while (exit == false);
    
}
        
        
        
    
   
    
}
