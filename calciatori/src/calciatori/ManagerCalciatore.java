/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calciatori;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author cucchiarini.cesare
 */
public class ManagerCalciatore {
    private ArrayList<Calciatore> calciatori;
    private LinkedHashMap<String, Integer> mappaSegni = new LinkedHashMap<>();
    private int maxGoal;
    
    public ManagerCalciatore(ArrayList<Calciatore> calciatori){
        this.calciatori = calciatori;
    }
    
    public ArrayList<Calciatore> getCalciatori(){
        return calciatori;
    }
    
    public void calcolaGoal(){
        String segno;
        for(Calciatore c : calciatori){
            segno = c.getSegno();
            
            if(mappaSegni.keySet().contains(segno))
                mappaSegni.put(segno, c.getGoal()+mappaSegni.get(segno));
            else
                mappaSegni.put(segno, c.getGoal());
        }
    }
    
    public void ordinaPerGoal(){
        mappaSegni = mappaSegni.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1,
            LinkedHashMap::new
        ));
        
        mappaSegni = (LinkedHashMap)mappaSegni.reversed();
        
        maxGoal = mappaSegni.values().iterator().next();
    }
    
    public ArrayList<Integer> calcolaPercentuali(){
        ArrayList<Integer> valori = new ArrayList<>();
        for(int v : mappaSegni.values().){

        }
    }
}
