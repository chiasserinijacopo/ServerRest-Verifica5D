/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteRequest {
    public String giocata;
    public int numero;  
    
    // Costruttore vuoto necessario per GSON
    public RouletteRequest() {
    }
    
    public RouletteRequest(String giocata, int numero) {  
        this.giocata = giocata;
        this.numero = numero;
    }


    public String getGiocata() {
        return giocata;
    }

    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "RouletteRequest{" + "giocata=" + giocata + ", numero=" + numero + '\'' +'}';
    }
    
}