/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speedclick_loret_crettiez;

/**
 *
 * @author benja
 */
public class Bouton {
    String Couleur;
    boolean Presence;
    
    public Bouton (String Color) {
        Couleur = Color;
        this.Presence = false;
    }
    
    public void afficherBouton () {
        Presence = true;
    }
    
    public void disparaitreBouton (){
        Presence = false;
    }
    
    
}
