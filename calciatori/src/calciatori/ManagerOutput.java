/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calciatori;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author sergi
 */
public class ManagerOutput {
    
    /**
     * 
     * 
     * @return presa una mappa contenente key di tipo String e value di tipo Integer, il ritorno è una mappa con stesse chiavi 
     *  e rapporto con il valore maggiore
     */
    public static LinkedHashMap<String, Integer> getOutput(LinkedHashMap<String, Integer> mappa){
        LinkedHashMap<String, Integer> output = new LinkedHashMap<>();
        String s;
        ArrayList<Integer> values = ManagerOutput.calcolaPercentuali(mappa.values());
        int counter = 0;
        
        for(Map.Entry<String, Integer> set : mappa.entrySet()){
            s = set.getKey() + " (" + set.getValue() + ")";
            output.put(s, values.get(counter));
            counter++;
        }
        return output;
    }
    
    private static ArrayList<Integer> calcolaPercentuali(Collection<Integer> mappa){
        int maxGoal = mappa.iterator().next();
        
        ArrayList<Integer> valori = new ArrayList<>();
        for(int v : mappa){
            valori.add(v*100/maxGoal);
        }
        return valori;
    }
}
