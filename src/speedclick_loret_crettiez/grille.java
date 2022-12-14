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
    Bouton [][] matrice;
    
    public grille (int lig, int col) {
        ligne = lig;
        colonne =  col;
        matrice = new Bouton [ligne][colonne];
    }
    
    public void CreationGrille () {
        for (int i = 0; i <= ligne; i++) {
            for (int j = 0; j <= colonne; j++) {
                matrice[i][j] = new Bouton();
            }
        }
    }
    
    
    public void RandomBouton () {
        int C = 0;
        int L = 0;
        Random ab = new Random ();
        C = ab.nextInt(colonne);
        L = ab.nextInt(ligne);
        matrice[L][C].afficherBouton();  
    }
    
    public void UtilisationCase () {
        matrice[ligne][colonne].activation();
        matrice[ligne][colonne].disparaitreBouton();
    }
}