/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speedclick_loret_crettiez;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Partie {
    //private grille Plateau;
    
    //public Partie (int TailleLigne, int TailleColonne) {
        //this.Plateau = New grille;
        
    //}

    public void LancerPartie (int TailleLigne, int TailleColonne) { 
        int a = TailleLigne;
        int b = TailleColonne;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Veuillez choisir la ligne du bouton allumé");
        ChoixLigne = scan.nextInt();
        System.out.println("Veuillez choisir la colonne du bouton allumé");  
        ChoixColonne = scan.nextInt();
        
        while (cpt<=15) {
            if (presenceBouton(ChoixLigne,ChoixColonne)==true);
            
            
        }
        
    }
        
}
