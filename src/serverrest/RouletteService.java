/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteService {
    
    /**
     * Esegue l'operazione matematica richiesta
     * 
     * @param numero numero uscito sulla roulette
     * @param giocata giocata del giocatore : "PARI, DISPARI"
     * @return Il risultato della giocata del giocatore
     * @throws IllegalArgumentException se ...
     */
    public static boolean ControlloVittoria(int numero, String giocata) 
            throws IllegalArgumentException {
        
        // Controllo se i parametri passati sono validi
                if (numero < 0 || numero > 36 || giocata == null || giocata.trim().isEmpty()) {
            throw new IllegalArgumentException("numero e giocata non possono essere vuoti e il numero deve essere tra 0 e 36");
        }
        int numero1 = numero;        
        String giocata1 = giocata.toUpperCase().trim();
        
        try {
            if (numero1 == 0){
                 {return false;}
            }
            int modulo = numero1 % 2;
           
            switch (modulo){
                case 1:
                   if ( "PARI".equals(giocata1)) {
                       return false;
                   }
                   else if("DISPARI".equals(giocata1)){
                       return true; 
                   };
                   break;
                case 0:
                    if ( "PARI".equals(giocata1)) {
                       return true;
                   }
                   else if("DISPARI".equals(giocata1)){
                       return false; 
                   };
                   break;
               
            }
            
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "giocata non valida. Giocata deve essere 'PARI' o 'DISPARI' o '0'");
        }
        return false; 
    }

  
}
