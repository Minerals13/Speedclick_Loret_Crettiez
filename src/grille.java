/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emili
 */
public class grille {
    
    Bouton[][] grille; //
    
    public grille {  //Initialisation d'un constructeur
     
        grille = new Bouton[n][n];  //Création d'un tableau n*n cases, composé par des éléments de type Bouton
        
        for (int ligne=0;ligne<n;ligne++) {
            for (int colonne=0;colonne<n;colonne++) {
                
                grille[ligne][colonne] =  new Bouton();
    
}
