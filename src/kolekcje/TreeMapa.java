package kolekcje;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapa {
    public static void main(String[] args) {
        SortedMap<String, Double> mapa = new TreeMap<>();
        mapa.put("kaczka", 4.5);
        mapa.put("kurczak", 1.5);
        mapa.put("indyk", 3.8);
        mapa.put("krowa", 500.0);
        mapa.put("zając", 2.5);
        mapa.put("dzik", 120.0);
        mapa.put("lew", 120.0);
        mapa.put("wrona", 0.3);
        for(Map.Entry<String, Double> entry : mapa.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        // podzbiór mapy od 'ib' do 'lu'
        SortedMap<String, Double> sortowana = mapa.subMap("ibis", "l");
        System.out.println("=== PODMAPA ===");
        for(Map.Entry<String, Double> entry : sortowana.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        //ogon mapy od 'kr'
        SortedMap<String, Double> ogon = mapa.tailMap("kr");
        System.out.println("=== OGON MAPY ===");
        for(Map.Entry<String, Double> entry : ogon.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        //głowa mapy do 'ku'
        SortedMap<String, Double> glowa = mapa.headMap("kukułka");
        System.out.println("=== GŁOWA MAPY ===");
        for(Map.Entry<String, Double> entry : glowa.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
