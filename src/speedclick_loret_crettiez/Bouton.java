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
    boolean Presence;
    
    public Bouton () {
        this.Presence = false;
    }
    
    public boolean presenceBouton () {
        return Presence;
    }
    
    public void placerBouton () {
        Presence =true;
    }
    

    
    public void disparaitreBouton (){
        Presence = false;
    }   
    
    @Override
    public String toString() {
        String retourner = null;
        if (presenceBouton() == true) {
            retourner = "X";
        }
        if (presenceBouton() == false) {
            retourner = "O";
        }
        return retourner;
    }
}
