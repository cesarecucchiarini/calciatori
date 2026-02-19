/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calciatori;

import java.io.IOException;

/**
 *
 * @author cucchiarini.cesare
 */
public class Calciatori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        SegnoZodiacale.aggiungiSegni(FileManager.leggiSegni("zodiaco.csv"));
        ManagerCalciatore m = new ManagerCalciatore(FileManager.leggiCalciatori("sportivi.csv"));
    }
    
}
