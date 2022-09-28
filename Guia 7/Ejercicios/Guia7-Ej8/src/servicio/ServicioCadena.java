package servicio;

import entidades.Cadena;

public class ServicioCadena {

    public int mostrarVocales(Cadena f1) {

      String frase=f1.getFrase();
        
        int contadorVocales;

        contadorVocales = 0;

        for (int i = 0; i < f1.getLongitudfrase(); i++) {

            if (("a").equalsIgnoreCase(frase.substring(i, i + 1)) || ("e").equalsIgnoreCase(frase.substring(i, i + 1)) || ("i").equalsIgnoreCase(frase.substring(i, i + 1))
                    || ("o").equalsIgnoreCase(frase.substring(i, i + 1)) || ("u").equalsIgnoreCase(frase.substring(i, i + 1))) {
           
                contadorVocales++;
                
            }

            
        }
        
        return contadorVocales;
    }
    
    public void invertirFrase(Cadena fra) {
    
        String fraseoriginal=fra.getFrase();
        String fraseinvertida = "";
        // Recorrer la frase original de atras para adelante
        for (int i = fraseoriginal.length()-1; i >= 0; i--) {
            
            fraseinvertida += fraseoriginal.charAt(i);
            
        }
    
        System.out.println("Frase Original es: " +fraseoriginal);
        System.out.println("Frase Invertida es: " +fraseinvertida);
    }
    
    public void vecesRepetido(String letra) {
    
        //System.out.println("Ingrese el caracter que desea contar");
                    
        int contadorletra = 0;
        
        // for (int i = 0; i < contenidoCadena.length(); i++)
        
        for (int i = 0; i < frase.length(); i++) {
            
           if ((letra).equalsIgnoreCase(frase.substring(i,i+1)) ) {
                
               contadorletra++;
            }
        }
        
        System.out.println("la letra: "+letra+" aparece "+ frase +" veces.");
        
        }
        
        
    
        
        
    }
    
    
    
    
    
}


    

