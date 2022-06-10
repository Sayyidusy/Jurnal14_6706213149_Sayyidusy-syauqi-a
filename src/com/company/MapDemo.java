package com.company;

import java.awt.*; // import java color
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//menggunakan Hash Map
// bukan tree map
public class MapDemo {
    public static void main(String[] args) {

        //variabel favoriteColors
        Map<String, Color> favoriteColors = new HashMap<String, Color>();
        //akan melakukan tipe data strings
        //key = nama
        //value = nama warnanya
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);
        favoriteColors.put("Sayyid", Color.WHITE);
        favoriteColors.put("Sauqi", Color.BLACK);


        //print semua key/value di dalam map
        Set<String> keySet = favoriteColors.keySet();
        //looping untuk semua key (key set)
        //akan mencetak key dan value nya
        for (String key : keySet)
        {
            //ambil value dari map
            Color value = favoriteColors.get(key);
            System.out.println(key + " : " + value);
        }

        //remove
        favoriteColors.remove("Sayyid");
        System.out.println(favoriteColors);
    }
}
