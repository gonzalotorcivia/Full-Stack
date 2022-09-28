
package guia7.ej8;

import entidades.Cadena;
import java.util.Locale;
import java.util.Scanner;
import servicio.ServicioCadena;



public class Guia7Ej8 {

      public static void main(String[] args) {
       
          Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
          // creamos el objeto
          Cadena frasepalabra = new Cadena();
          
          System.out.println("Ingrese una frase o palabra");
          
          String fraseingresada = leer.nextLine();
          
          frasepalabra.setFrase(fraseingresada);//guardo la frase atraves del set
          frasepalabra.setLongitudfrase(fraseingresada.length()); //guardo la longitud atraves del set
          
          ServicioCadena sc = new ServicioCadena();
          
          //traigo del servicio los metodos
          System.out.println("La frase o palabra ingresada tiene " +sc.mostrarVocales(frasepalabra)+ " vocales");
         
          sc.invertirFrase(frasepalabra);
          
          sc.vecesRepetido(fraseingresada);
          
          
          
          
          
    }
    
}
