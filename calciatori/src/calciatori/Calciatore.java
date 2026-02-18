/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calciatori;

import java.time.LocalDate;

/**
 *
 * @author cucchiarini.cesare
 */
public class Calciatore {
    private int goal;
    private String nome;
    private String nazionalita;
    private LocalDate nascita;
    private String segno;

    public Calciatore(int goal, String nome, String nazionalita, LocalDate nascita) {
        this.goal = goal;
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.nascita = nascita;
        calcolaSegno();
    }
    
    public void calcolaSegno(){
        segno = SegnoZodiacale.getSegno(nascita);
    }
}
