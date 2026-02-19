/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calciatori;

import java.io.*;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * @author cucchiarini.cesare
 */
public class FileManager {

    public static LinkedHashMap leggiSegni(String path) throws IOException {
        LinkedHashMap<String, MonthDay[]> segni = new LinkedHashMap<>();
        try (BufferedReader r = new BufferedReader(new FileReader(path))) {
            String line;
            String[] split;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");
            while ((line = r.readLine()) != null) {
                split = line.split(",");
                segni.put(split[0], new MonthDay[]{MonthDay.parse(split[1], formatter), MonthDay.parse(split[2], formatter)});
            }
        }
        return segni;
    }

    public static ArrayList<Calciatore> leggiCalciatori(String path) throws IOException{
        ArrayList<Calciatore> calciatori = new ArrayList<>();
        try (BufferedReader r = new BufferedReader(new FileReader(path))) {
            String line;
            String[] split;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            while((line = r.readLine())!=null){
                split = line.split(",");
                
                calciatori.add(new Calciatore(split[0], Integer.parseInt(split[1]), split[2], LocalDate.parse(split[3], formatter)));
            }
        }
        return calciatori;
    }
}
