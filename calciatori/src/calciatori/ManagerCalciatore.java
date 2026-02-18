/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calciatori;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * @author cucchiarini.cesare
 */
public class ManagerCalciatore {
    private ArrayList<Calciatore> calciatori;
    private LinkedHashMap<String, Integer> mappaSegni = new LinkedHashMap<>();
    
    public ManageCalciatore(ArrayList<Calciatore> calciatori){
        this.calciatori = calciatori;
    }
}
