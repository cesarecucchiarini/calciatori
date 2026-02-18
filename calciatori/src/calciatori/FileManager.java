/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calciatori;

import java.io.*;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author cucchiarini.cesare
 */
public class FileManager {
    public static void leggiSegni(String path) throws IOException{
        try(BufferedReader r = new BufferedReader(new FileReader(path))){
            String line;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");
            while((line = r.readLine()) != null){
                String[] split = line.split(",");
                SegnoZodiacale.aggiungiSegno(split[0], MonthDay.parse(split[1], formatter), MonthDay.parse(split[2], formatter));
            }
        }
    }
    
}
