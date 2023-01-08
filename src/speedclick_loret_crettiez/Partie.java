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
    private grille Plateau;
    
    
    public Partie (int TailleLigne, int TailleColonne) {
        this.Plateau = new grille(TailleLigne, TailleColonne);
        
    }

    public void LancerPartie (int TailleLigne, int TailleColonne) { 
        int a = TailleLigne;
        int b = TailleColonne;
        int cpt =0;
        Scanner scan = new Scanner(System.in);
        
        
        
        while (cpt<=15) {  
            int LigneON=Plateau.LigneAllumee(a); //on appelle la méthode LigneAllumée pour déterminer quel indice de ligne notre bouton va prendre
            int ColonneON=Plateau.ColonneAllumee(b); //Pareil mais pour la colonne
        
            Plateau.PlacerBouton(LigneON, ColonneON); //On place notre bouton fraichement déterminé, sur la grille
            Plateau.afficherMatriceSurConsole(a, b); //On affiche la grille avec le bouton
            
            System.out.println("Veuillez choisir la ligne du bouton allumé"); 
            int ChoixLigne = scan.nextInt(); //On demande à l'utilisateur l'indice de la ligne de la case dans laquelle le bouton allumé
            System.out.println("Veuillez choisir la colonne du bouton allumé");  
            int ChoixColonne = scan.nextInt(); //même chose mais pour les colonnes
            
            
            while ( (Plateau.PresenceBouton(ChoixLigne,ChoixColonne)!=Plateau.PresenceBouton(LigneON,ColonneON))) {
                System.out.println("Veuillez choisir la ligne du bouton allumé"); 
                int ChoixLigne = scan.nextInt(); //On demande à l'utilisateur l'indice de la ligne de la case dans laquelle le bouton allumé
                System.out.println("Veuillez choisir la colonne du bouton allumé");  
                int ChoixColonne = scan.nextInt(); //même chose mais pour les colonnes
                
                
                cpt=cpt+1;  //Si c'est la bonne case, l'utilisateur gagne un point
                
                
                Plateau.DisparitionBouton(LigneON,ColonneON); //Et on fait disparaitre le bouton
            }else 
                
            }    
            
            
            
            
        }
        
    }
        
}
