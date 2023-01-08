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

    public void LancerPartie (int TailleLigne, int TailleColonne) {  //méthode qui permets de jouer à une partie classique. Dedans on détermine des nouvelles coordonnées de bouton à chaque fois qu'il est trouvé, et on affiche la nouvelle grille à chaque fois        
        int a = TailleLigne;
        int b = TailleColonne;
        int cpt =0; //C'est le compteur pour le nombre de point de l'utilisateur
        Scanner scan = new Scanner(System.in);
        
        
        
        while (cpt<=15) {  
            int LigneON=Plateau.LigneAllumee(a); //on appelle la méthode LigneAllumée pour déterminer quel indice de ligne notre bouton va prendre
            int ColonneON=Plateau.ColonneAllumee(b); //Pareil mais pour la colonne
        
            Plateau.PlacerBouton(LigneON, ColonneON); //On place notre bouton de coordonnées déterminées juste au dessus , sur la grille
            Plateau.afficherMatriceSurConsole(a, b); //On affiche la grille avec le bouton avec en paramètre la taille de la matrice
            
            System.out.println("Veuillez choisir la ligne du bouton allume"); 
            int ChoixLigne = scan.nextInt(); //On demande à l'utilisateur l'indice de la ligne de la case dans laquelle le bouton allumé
            System.out.println("Veuillez choisir la colonne du bouton allume");  
            int ChoixColonne = scan.nextInt(); //même chose mais pour les colonnes
                
            
             //On regarde si les coordonnées données par l'utilisateurs sont les mêmes que celles du bouton
             //On donne 3 chances, au bout du troisème raté le compteur redescend à 0
             //A chaque erreure d'affilée on rentre dans un nouveau if
             //Si les coordonnées sont bonnes, on rentre dans le else if correspondant au 1er, 2e ou 3e essai. On donne alors un point à l'utilisateur et on fait disparaitre le bouton pour la prochaine manche
            if ( (Plateau.PresenceBouton2(ChoixLigne,ChoixColonne)!=Plateau.PresenceBouton(LigneON,ColonneON))) {    //Premier essai
                System.out.println("Rate, plus que 2 essais");
                Plateau.afficherMatriceSurConsole(a, b); //On réaffiche la grille
                System.out.println("Veuillez choisir la ligne du bouton allumé"); 
                ChoixLigne = scan.nextInt(); //On ajoute un -1 car sinon, si le l'utilisateur sélectionne la 4e ligne d'une matrice 4x4, c'est comme si on cherchait la 5e ligne car la matrice commence à 0 et est de taille n-1
                System.out.println("Veuillez choisir la colonne du bouton allumé");  
                ChoixColonne = scan.nextInt(); 
                
                
                if ( (Plateau.PresenceBouton2(ChoixLigne,ChoixColonne)!=Plateau.PresenceBouton(LigneON,ColonneON))) {    //Deuxième essai 
                    System.out.println("Encore Rate, plus que 1 essai");
                    Plateau.afficherMatriceSurConsole(a, b);
                    System.out.println("Veuillez choisir la ligne du bouton allumé"); 
                    ChoixLigne = scan.nextInt(); 
                    System.out.println("Veuillez choisir la colonne du bouton allumé");  
                    ChoixColonne = scan.nextInt(); 
                
                    
                    if ( (Plateau.PresenceBouton2(ChoixLigne,ChoixColonne)!=Plateau.PresenceBouton(LigneON,ColonneON))) {    //Troisième essai 
                        System.out.println("Vous avez fait trop d'erreur a la suite");
                        System.out.println("Recommencez a 0");
                        cpt=0; 
                        Plateau.DisparitionBouton(LigneON, ColonneON); 
                    } else if  (Plateau.PresenceBouton2(ChoixLigne,ChoixColonne)==Plateau.PresenceBouton(LigneON,ColonneON)) { //C'est validé au 3e essai
                    cpt+=1; //Si c'est la bonne case, l'utilisateur gagne un point
                    System.out.println("Vous avez trouve le bon bouton");
                    Plateau.DisparitionBouton(LigneON, ColonneON); } //Et on fait disparaitre le bouton
                    
                    
                }else if  (Plateau.PresenceBouton2(ChoixLigne,ChoixColonne)==Plateau.PresenceBouton(LigneON,ColonneON)) { //C'est validé au 2e essai
                    cpt+=1;
                    System.out.println("Vous avez trouve le bon bouton");
                    Plateau.DisparitionBouton(LigneON, ColonneON); }
                    
                    
            }else if  (Plateau.PresenceBouton2(ChoixLigne,ChoixColonne)==Plateau.PresenceBouton(LigneON, ColonneON)) { //C'est validé au 1er essai
                cpt+=1;
                System.out.println("Vous avez trouve le bon bouton");
                Plateau.DisparitionBouton(LigneON, ColonneON);       
            }    
            
        //Puis on recommence avec des nouvelles coordonnées, jusqu'à ce qu'on ait 15 points
  
        }
        
    }
        
}
