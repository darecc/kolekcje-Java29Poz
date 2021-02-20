package kolekcje;

import java.io.*;
import java.util.*;

public class Truciciele {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> mapa = new HashMap<>();
        //czytanie danych
        String plik = "truciciele.txt";
        File file = new File(plik);
        try {
            BufferedReader buf = new BufferedReader(new FileReader(file));
            String linia = "";
            try {
                while ((linia = buf.readLine()) != null) {
                    String[] fragments = linia.split(",");
                    String firma = fragments[0];
                    ArrayList<String> produkty = new ArrayList<>();
                    for(int i = 1; i < fragments.length; i++)
                        produkty.add(fragments[i]);
                    mapa.put(firma, produkty);
                }
            }
            catch(IOException ie) {
                System.out.println(ie.getMessage());
            }
        }
        catch(FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
        //region Wyświetlenie mapy
        for(Map.Entry<String, ArrayList<String>> wpis : mapa.entrySet()) {
            System.out.print(wpis.getKey() + " -> ");
            for(String produkt : wpis.getValue())
                System.out.print(produkt + ", ");
            System.out.println();
        }
        //endregion
        //region Odwrócenie mapy
        HashMap<String, ArrayList<String>> odwrotna = new HashMap<>();
        for(Map.Entry<String, ArrayList<String>> wpis : mapa.entrySet()) {
            String firma = wpis.getKey();
            ArrayList<String> produkty = wpis.getValue();
            for(String produkt : produkty) {
                ArrayList<String> lista = new ArrayList<>();
                if (odwrotna.containsKey(produkt)) {
                    lista = odwrotna.get(produkt);
                    lista.add(firma);
                    odwrotna.put(produkt, lista);
                } else {
                    lista.add(firma);
                    odwrotna.put(produkt, lista);
                }
            }
        }
        //endregion
        //region Wyświetlenie mapy
        for(Map.Entry<String, ArrayList<String>> wpis : odwrotna.entrySet()) {
            System.out.print(wpis.getKey() + " -> ");
            for(String firma : wpis.getValue())
                System.out.print(firma + ", ");
            System.out.println();
        }
        //endregion
        //region Sporządzenie listy produktów produkowanych przez jakąkolwiek firmę na podstawie haszmapy 'mapa'
        HashSet<String> zbiorek2 = new HashSet<>();

        for(Map.Entry<String, ArrayList<String>> entry : mapa.entrySet()) {
            for(String s : entry.getValue())
                zbiorek2.add(s);
        }
        System.out.println("=== LISTA PRODUKTÓW ===");
        zbiorek2.forEach(System.out::println);
        //endregion
        //region Sporządzenie listy produktów produkowanych przez jakąkolwiek firmę na podstawie haszmapy 'odwrotna'
        TreeSet<String> zbiorek = new TreeSet<>();
        for(String nazwa : odwrotna.keySet())
            zbiorek.add(nazwa);
        //endregion
        System.out.println("=== LISTA PRODUKTÓW ===");
        zbiorek.forEach(System.out::println);
        System.out.println("=== LISTA PRODUKTÓW ===");
        Iterator<String> it = zbiorek.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        System.out.println("=== lista produktów i ile firm je produkuje ===");
        it = zbiorek.iterator();
        while(it.hasNext()) {
            String nazwa = it.next();
            int ile = odwrotna.get(nazwa).size();
            System.out.println(nazwa + " " + ile);
        }
        //region Ile jest takich produktów?
        System.out.println("Produktów jest: " + zbiorek.size());
        //endregion

    }
}
