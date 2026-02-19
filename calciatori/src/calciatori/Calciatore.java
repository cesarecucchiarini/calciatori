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

    public Calciatore(String nome, int goal, String nazionalita, LocalDate nascita) {
        this.goal = goal;
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.nascita = nascita;
        calcolaSegno();
    }
    
    public void calcolaSegno(){
        segno = SegnoZodiacale.getSegno(nascita);
    }
    
    @Override 
    public String toString(){
        return nome + " " + segno;
    }

    public int getGoal() {
        return goal;
    }

    public String getSegno() {
        return segno;
    }
    
    
}
