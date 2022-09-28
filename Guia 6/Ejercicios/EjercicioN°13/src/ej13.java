
import java.util.Scanner;




public class ej13 {

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
System.out.println("INGRESAR EL TAMAÑO DEL CUADRADO");

int tamaño = leer.nextInt();

for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                if (i > 1 && i < tamaño && j > 1 && j < tamaño) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("");
        }

    }

}
   
    
