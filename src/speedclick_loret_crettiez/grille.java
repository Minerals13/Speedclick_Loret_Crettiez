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
    Bouton[][] matrice;  //On appellera notre grille de jeu intéractive, la matrice, et elle sera composé d'objet de type bouton

    
    public grille (int a, int b) {  //Création d'une grille de taille donnée en paramètre. Toutes les cases sont remplis d'un objet de type Bouton
        matrice = new Bouton[a][b];
        ligne = a;
        colonne =  b;
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++) {
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
        LigneON = random.nextInt(TailleLigne);         //On choisit un entier entre 0 et la taille de la matrice+1. Cette taille est donnée par l'utilisateur en entrée de programme      
    return LigneON; //On retourne l'indice de ligne du bouton allumé
    
    }
    
    public int ColonneAllumee (int b) { //Au même titre que LigneAllumee, ColonneAllumee permets de donner l'indice de la colonne du bouton qu'on va allumer
        int TailleColonne=b;
        Random random = new Random();
        int ColonneON;
        ColonneON = random.nextInt(TailleColonne);
    return ColonneON; //On retourne l'indice de colonne du bouton allumé
    }
            
            
    public void afficherMatriceSurConsole(int a, int b) { //Méthode permettant d'afficher la matrice sur la console avec le bouton allumé; a et b correspondent à la taille de la matrice
        ligne = a;
        colonne =  b;
        for (int i=0;i<ligne;i++) { //On print toutes les colonnes d'une même ligne avec le caractères correspondant (O si y'a rien, X si y'a le bouton, pour ça on a une méthode tostring))
            for (int j=0;j<colonne;j++) {
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println(" "+(i+1)); //à la fin de chaque ligne, on affiche l'indice de cette même ligne
        }
        for (int i=0;i<colonne;i++){ //On veut aussi afficher l'indice des colonnes donc après avoir print la matrice et les indices de ligne
            int cpt=i+1;
            System.out.print(cpt+" "); //On va print les indices des b colonnes (b donne le nombre de colonne de la matrice, choisi par l'utilisateur)
        }
    }
    
    
    public void PlacerBouton (int LigneON,int ColonneON) {  //Permets de placer notre bouton aux coordonnées données par LigneAllumee et ColonneAllumee
        matrice[LigneON][ColonneON].PlacerBouton();
    }
    
    
    public boolean PresenceBouton (int LigneON,int ColonneON) {  //Si il y a un bouton au coordonnées mises en paramètre, on renverra true. gGère les coordonnées déterminées automatiquement
        if (matrice[LigneON][ColonneON].DetectionBouton()==true) {
            return true;
        } else {
            return false;
        }
    }
    
    
    public boolean PresenceBouton2 (int ChoixLigne, int ChoixColonne) {  //Si il y a un bouton au coordonnées mises en paramètre, on renverra true. gGère les coordonnées données par l'utilisateur 
        if (matrice[ChoixLigne][ChoixColonne].DetectionBouton()==true) {
            return true;
        } else {
            return false;
        }
    }
    
    public void DisparitionBouton (int LigneON, int ColonneON) {  //Fais disparaitre le bouton en certaines coordonnées données en paramètre
        matrice[LigneON][ColonneON].DisparaitreBouton();
    }
    
    
    
    
    public int LigneAllumeeMauvais (int a) {  //Permets de déterminer un entier au hasard, qui correspond à un indice de ligne dans notre matrice pour notre mauvais bouton qui s'allume
        int TailleLigne=a;
        Random random = new Random(); 
        int BadLigne;
        BadLigne = random.nextInt(TailleLigne);         //On choisit un entier entre 0 et la taille de la matrice+1. Cette taille est donnée par l'utilisateur en entrée de programme      
    return BadLigne; //On retourne l'indice de ligne du mauvais bouton allumé
    }
    
    public int ColonneAllumeeMauvais (int b) { //Au même titre que LigneAllumeeMauvais, ColonneAllumeeMauvais permets de donner l'indice de la colonne du mauvais bouton qu'on va allumer
        int TailleColonne=b;
        Random random = new Random();
        int BadColonne;
        BadColonne = random.nextInt(TailleColonne);
    return BadColonne; //On retourne l'indice de colonne du mauvais bouton allumé
    }
    
    public void PlacerMauvaisBouton (int BadLigne,int BadColonne) {  //Permets de placer notre mauvais bouton aux coordonnées données par LigneAllumeeMauvais et ColonneAllumeeMauvais
        matrice[BadLigne][BadColonne].PlacerMauvaisBouton();
    }
    
    public boolean PresenceMauvaisBouton (int BadLigne,int BadColonne) {  //Si il y a un mauvais bouton aux coordonnées mises en paramètre, on renverra true. gGère les coordonnées déterminées automatiquement
        if (matrice[BadLigne][BadColonne].DetectionMauvaisBouton()==true) {
            return true;
        } else {
            return false;
        }
    }
    
    public void DisparitionMauvaisBouton (int BadLigne, int BadColonne) {  //Fais disparaitre le mauvais bouton en certaines coordonnées données en paramètre
        matrice[BadLigne][BadColonne].DisparaitreMauvaisBouton();
    }
    
    }
