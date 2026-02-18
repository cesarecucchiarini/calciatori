/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package calciatori;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashMap;

/**
 *
 * @author cucchiarini.cesare
 */
public class SegnoZodiacale {
    
    private static HashMap<String, MonthDay[]> date = new HashMap<>();
    
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
    
    public static void aggiungiSegno(String segno, MonthDay inizio, MonthDay fine){
        date.put(segno, new MonthDay[]{inizio, fine});
    }
}
