/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package calciatori;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author cucchiarini.cesare
 */
public class SegnoZodiacale {
    
    private static LinkedHashMap<String, MonthDay[]> date = new LinkedHashMap<>();
    
    public static String getSegno(LocalDate data){
        MonthDay d = MonthDay.from(data);
        
        for(String segno : date.keySet()){
            if(isInDate(d, date.get(segno))) return segno;
        }
        return "Capricorno";
    }
    
    public static boolean isInDate(MonthDay data, MonthDay[] periodo){
        return data.compareTo(periodo[0]) + 1 > 0 && data.compareTo(periodo[1]) - 1 < 0;
    }
    
    public static void aggiungiSegni(Map<String, MonthDay[]> segni){
        date = (LinkedHashMap) segni;
    }
}
