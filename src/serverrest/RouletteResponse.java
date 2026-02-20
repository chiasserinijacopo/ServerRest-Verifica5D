/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteResponse {
 public String giocata;
 public int numero;
 public boolean vittoria;
    
    // Costruttore vuoto necessario per GSON
    public RouletteResponse() {
    }

    public RouletteResponse(String giocata, int numero, boolean vittoria) {
        this.giocata = giocata;
        this.numero = numero;
        this.vittoria = vittoria;
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

    public boolean isVittoria() {
        return vittoria;
    }

    public void setVittoria(boolean vittoria) {
        this.vittoria = vittoria;
    }
    
    
    
}