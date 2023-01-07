package speedclick_loret_crettiez;

import java.util.Random;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emili
 */
public class grille {
    int ligne;
    int colonne;
    Bouton [][] matrice;  //On appellera notre grille de jeu intéractive, la matrice, et elle sera composé d'objet de type bouton

    
    public grille (int lig, int col) {  //Création d'une grille de taille donnée en paramètre
        ligne = lig;
        colonne =  col;
        for (int i = 0; i <= ligne; i++) {
            for (int j = 0; j <= colonne; j++) {
                matrice[i][j] = new Bouton();
            }
        }        
    }                 
   

    //public void RandomBouton () {
      //  int C = 0;
        //int L = 0;
        //Random ab = new Random ();
        //C = ab.nextInt(colonne);
        //L = ab.nextInt(ligne);
       // matrice[L][C].afficherBouton();  
   // }
    
    public int LigneAllumee (int a) {  //Permets de déterminer un entier au hasard, qui correspond à un indice de ligne dans notre matrice pour notre bouton qui s'allume
        int TailleLigne=a;
        Random random = new Random(); 
        int LigneON;
        LigneON = random.nextInt(TailleLigne+1);         //On choisit un entier entre 0 et la taille de la matrice+1. Cette taille est donnée par l'utilisateur en entrée de programme      
    return LigneON; //On retourne l'indice de ligne du bouton allumé
    
    }
    
    public int ColonneAllumee (int b) { //Au même titre que LigneAllumee, ColonneAllumee permets de donner l'indice de la colonne du bouton qu'on va allumer
        int TailleColonne=b;
        Random random = new Random();
        int ColonneON;
        ColonneON = random.nextInt(TailleColonne+1);
    return ColonneON; //On retourne l'indice de colonne du bouton allumé
    }
            
            
    public void UtilisationCase () {
        matrice[ligne][colonne].activation();
        matrice[ligne][colonne].disparaitreBouton();
    }
    
    public void afficherMatriceSurConsole(int a, int b) {
        ligne = a;
        colonne =  b;
        for (int i=0;i<=ligne;i++) {
            for (int j=0;j<=colonne;j++) {
                System.out.print(matrice[i][j]+" ");
            }
        
        }
            
    }
    

    }
