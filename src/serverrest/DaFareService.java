/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class DaFareService {
    
    /**
     * Esegue l'operazione matematica richiesta
     * 
     * @param numero numero uscito sulla roulette
     * @param giocata giocata del giocatore : "PARI, DISPARI"
     * @return Il risultato della giocata del giocatore
     * @throws IllegalArgumentException se ...
     */
    public static double logicaDiCalcolo(int numero, String giocata) 
            throws IllegalArgumentException {
        
        // Controllo se i parametri passati sono validi
                if (numero>=0 || numero!= 0 || giocata.trim().isEmpty()) {
            throw new IllegalArgumentException("numero e giocata non possono essere vuoti");
        }
        
        try {
            
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Opzione non valida. Opzione deve essere DA FARE");
        }
        return 0; // Placeholder, da sostituire con il risultato della logica di calcolo
    }

    // Metodo di validazione dei parametri (da implementare)
    private static boolean parametriValidi()
    {
        return false;
    }
}
