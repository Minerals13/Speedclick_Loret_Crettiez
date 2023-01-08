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
    boolean Presence;  //Variable du bon bouton
    boolean PresenceMauvais; //Variable du mauvais bouton
    
    public Bouton () {
        this.Presence = false; //On les initialise à false
        this.PresenceMauvais = false;
    }
    
    public boolean DetectionBouton () {
        return Presence; //Retourne vrai ou faux selon la possible présence du bouton
    }
    
    public void PlacerBouton () {
        Presence =true; //Place le bon bouton
    }
    
    public void DisparaitreBouton (){
        Presence = false; //Fait disparaitre le bon bouton
    } 
    
    public boolean DetectionMauvaisBouton() {
        return PresenceMauvais; //Retourne vrai ou faux selon la possible présence du bouton
    }   
    
    public void PlacerMauvaisBouton () {
        PresenceMauvais =true; //Place un mauvais bouton
    }
    
    public void DisparaitreMauvaisBouton (){
        PresenceMauvais = false; //Place un mauvais bouton
    } 
    
    @Override
    public String toString() {
        String retourner = null;
        if (DetectionBouton() == true) {
            retourner = "X"; //Si il y a un bon bouton
        }
        if (DetectionBouton() == false) {
            retourner = "O"; //Si il n'y a rien
        }
       
        if (DetectionMauvaisBouton() == true) { //Si il y a un mauvais bouton
            if (DetectionBouton() == true) { //Et un bon bouton
                DisparaitreMauvaisBouton(); //Le mauvais mouton disparait
                retourner = "X"; //Le bon bouton prend le dessus
            } else { //Si il n'y a pas de bon bouton
            retourner = "@"; //Le mauvais bouton s'affiche
            }
        }
        if (DetectionMauvaisBouton() == false) { //Si il n'y a pas de mauvais bouton
            if (DetectionBouton() == true) { //Et un bon bouton
                retourner = "X"; //Le bon bouton prend le dessus 
            } else { //Si il n'y a pas de bon bouton
                retourner = "O"; //Rien ne s'affiche
            }
        }
        return retourner;
    }
}
