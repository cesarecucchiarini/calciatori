/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calciatori;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author cucchiarini.cesare
 */
public class ManagerCalciatore {
    private ArrayList<Calciatore> calciatori;
    
    /**
     * mappa che permette di mantenere anche l'ordine per ordinare in base ai goal
     */
    private LinkedHashMap<String, Integer> mappaSegni = new LinkedHashMap<>();
    
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
        
        ordinaPerGoal();
    }
    
    private void ordinaPerGoal(){
        
        Stream<Entry<String, Integer>> stream = mappaSegni.entrySet().stream();
        
        mappaSegni = stream.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));
        
        
    }
    
    public LinkedHashMap<String, Integer> getMappaSegni(){
        return mappaSegni;
    }
}
