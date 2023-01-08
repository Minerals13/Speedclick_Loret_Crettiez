/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package speedclick_loret_crettiez;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Speedclick_Loret_Crettiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    System.out.println("Quelle taille de matrice voulez vous ? Renseignez le nombre de ligne puis de colonne");
    Scanner scan = new Scanner(System.in);
    
    int TailleLigne = scan.nextInt();
    int TailleColonne = scan.nextInt();
    Partie Jouer = new Partie(TailleLigne,TailleColonne);
    
    
    Jouer.LancerPartie(TailleLigne,TailleColonne);
    
    
    
    
    } 
    
    
    
}
