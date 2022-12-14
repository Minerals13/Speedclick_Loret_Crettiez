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
    boolean Click;
    
    public Bouton () {
        this.Presence = false;
        this.Click = false;
    }
    
    public boolean presenceBouton () {
        return Presence;
    }
    
    public void afficherBouton () {
        Presence = true;
    }
    
    public void disparaitreBouton (){
        Presence = false;
    }
    
    public void activation () {
        Click = true;
    }
    
    public void desactivation () {
        Click = false;
    }
    
}
